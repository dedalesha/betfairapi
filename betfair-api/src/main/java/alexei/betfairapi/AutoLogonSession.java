package alexei.betfairapi;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.filter.LoggingFilter;

import alexei.betfairapi.entities.LoginResult;
import alexei.betfairapi.entities.LoginStatus;
import alexei.betfairapi.keystore.AuthResult;
import alexei.betfairapi.keystore.InitKeyStore;
import alexei.betfairapi.keystore.KeyStoreAuth;
import static javax.ws.rs.client.ClientBuilder.*;

public class AutoLogonSession implements Session {

	private String sessionToken;
	private String applicationKey;
	private Client client;
	
	private static final String BETFAIR_KEYSTORE_PASSWORD_PROPERTY = "betfair.keystore.password";
	
	@Inject
	public AutoLogonSession(Client jaxRsClient) {
		this.client = jaxRsClient;
	}
	
	public String getSessionToken() {
		if (sessionToken==null) login();
		return sessionToken;
	}

	public String getAppKey() {
		if (applicationKey==null) login();
		return applicationKey;
	}

	public String login() {
		
		try {
			
			String keyStorePasswordStr = System.getProperty(BETFAIR_KEYSTORE_PASSWORD_PROPERTY);
			if (keyStorePasswordStr == null) {
				throw new RuntimeException("System property "+BETFAIR_KEYSTORE_PASSWORD_PROPERTY+" must be set to the password of keystore that was created with "+InitKeyStore.class.getName());
			}
			
			KeyStoreAuth storeAuth = new KeyStoreAuth(keyStorePasswordStr); 
			AuthResult auth = storeAuth.authenticate();
			if (!auth.isSuccessful()) {
				throw new RuntimeException("Could not load authentication information: "+auth.getErrorMessage());
			}
			applicationKey = auth.getAppkey();
			
			Form form = new Form();
			form.param("username", auth.getUsername());
			form.param("password", auth.getPassword());
	
			Response response = client
				.register(new LoggingFilter(Logger.getLogger(AutoLogonSession.class.getName()), true))
				.target("https://identitysso.betfair.com/api/login")
				.request(MediaType.APPLICATION_JSON)
				.header("X-Application", auth.getAppkey())
				.header("Content-Type", MediaType.APPLICATION_FORM_URLENCODED)
				.post(Entity.form(form));
			
			LoginResult loginResult = response.readEntity(LoginResult.class);
	
			
			if (loginResult.getStatus() == LoginStatus.SUCCESS) {
				sessionToken = loginResult.getToken();
				return loginResult.getToken();
			} else {
				throw new RuntimeException("Could not log in: "+loginResult.getError());
			}
		} catch (Exception e) {
			throw new RuntimeException("Could not log in: "+e, e);
		}

	}

}
