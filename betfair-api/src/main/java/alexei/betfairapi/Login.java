package alexei.betfairapi;

import java.util.logging.Logger;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.filter.LoggingFilter;

import alexei.betfairapi.entities.LoginResult;
import alexei.betfairapi.entities.LoginStatus;
import alexei.betfairapi.keystore.KeyStoreAuth;
import static javax.ws.rs.client.ClientBuilder.*;

public class Login {

	private static String sessionId;
	private static String applicationKey;
	
	public static String getSessionId() {
		return sessionId;
	}

	public static String getAppKey() {
		return applicationKey;
	}

	public static String login() {
		
		//TODO: add logging
		try {
			KeyStoreAuth auth = KeyStoreAuth.getInstance();
			applicationKey = auth.getAppkey();
			
			Form form = new Form();
			form.param("username", auth.getUsername());
			form.param("password", auth.getPassword());
	
			Response response = newClient()
				.register(new LoggingFilter(Logger.getLogger(Login.class.getName()), true)) //TODO: add logging filter only if debug is enabled
				.target("https://identitysso.betfair.com/api/login")
				.request(MediaType.APPLICATION_JSON)
				.header("X-Application", auth.getAppkey())
				.header("Content-Type", MediaType.APPLICATION_FORM_URLENCODED)
				.post(Entity.form(form));
			
			LoginResult loginResult = response.readEntity(LoginResult.class);
	
			
			if (loginResult.getStatus() == LoginStatus.SUCCESS) {
				sessionId = loginResult.getToken();
				return loginResult.getToken();
			} else {
				throw new RuntimeException("Could not log in: "+loginResult.getError());
			}
		} catch (Exception e) {
			throw new RuntimeException("Could not log in: "+e, e);
		}

	}

}
