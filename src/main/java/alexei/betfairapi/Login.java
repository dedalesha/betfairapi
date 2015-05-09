package alexei.betfairapi;

import java.util.logging.Logger;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.filter.LoggingFilter;

import alexei.betfairapi.entities.LoginResult;
import alexei.betfairapi.entities.LoginStatus;
import static javax.ws.rs.client.ClientBuilder.*;

public class Login {

	private static String sessionId;
	private static String applicationKey;
	
	public static String getSessionId() {
		return sessionId;
	}

	public static void setSessionId(String sessionId) {
		Login.sessionId = sessionId;
	}

	public static String getAppKey() {
		return applicationKey;
	}

	public static void setAppKey(String appKey) {
		Login.applicationKey = appKey;
	}

	public static String getSessionId(String username, String password, String appKey) {
		
		//TODO: add logging
		
		setAppKey(appKey);
		
		Form form = new Form();
		form.param("username", username);
		form.param("password", password);

		Response response = newClient()
			.register(new LoggingFilter(Logger.getLogger(Login.class.getName()), true)) //TODO: add logging filter only if debug is enabled
			.target("https://identitysso.betfair.com/api/login")
			.request(MediaType.APPLICATION_JSON)
			.header("X-Application", appKey)
			.header("Content-Type", MediaType.APPLICATION_FORM_URLENCODED)
			.post(Entity.form(form));
		
		LoginResult loginResult = response.readEntity(LoginResult.class);

		
		if (loginResult.getStatus() == LoginStatus.SUCCESS) {
			setSessionId(loginResult.getToken());
			return loginResult.getToken();
		} else {
			throw new RuntimeException("Could not log in: "+loginResult.getError());
		}

	}
	
}
