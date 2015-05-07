package alexei.betfairapi;

import static javax.ws.rs.client.ClientBuilder.newClient;

import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.filter.LoggingFilter;

import alexei.betfairapi.entities.LoginResult;

public class MarketOperations {
	
	private String appKey;
	private String sessionToken;

	public MarketOperations(String appKey, String sessionToken) {
		this.appKey = appKey;
		this.sessionToken = sessionToken;
	}
	
	public void listFootballMarkets() {

//		Response response = newClient()
//			.register(new LoggingFilter(Logger.getLogger(Login.class.getName()), true)) //TODO: add logging filter only if debug is enabled
//			.target("https://api.betfair.com/exchange/betting/rest/v1.0/")
//			.request(MediaType.APPLICATION_JSON)
//			.header("X-Application", appKey)
//			.header("X-Authentication", sessionToken)
//			.header("Content-Type", MediaType.APPLICATION_FORM_URLENCODED)
//			
//			.post(Entity.form(form));
//		
//		LoginResult loginResult = response.readEntity(LoginResult.class);
	}
}
