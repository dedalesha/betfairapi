package alexei.betfairapi;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.filter.LoggingFilter;

import static javax.ws.rs.client.ClientBuilder.*;

public class Login {

	public static String getSessionId(String username, String password, String appKey) {
		
		//TODO: add logging
		
		Form form = new Form();
		form.param("username", username);
		form.param("password", password);

		Response response = newClient()
			.register(new LoggingFilter()) //TODO: add logging filter only if debug is enabled
			.target("https://identitysso.betfair.com/api/login")
			.request(MediaType.APPLICATION_JSON)
			.header("X-Application", appKey)
			.header("Content-Type", MediaType.APPLICATION_FORM_URLENCODED)
			.post(Entity.form(form));
		
		System.out.println(response.readEntity(String.class)); //TODO: add login response entity
		
		return null;
	}
	
}
