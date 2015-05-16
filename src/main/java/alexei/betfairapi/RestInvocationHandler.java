package alexei.betfairapi;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;
import javax.ws.rs.core.Response.Status.Family;

import org.glassfish.jersey.filter.LoggingFilter;

import alexei.betfairapi.entities.BetfairAPI;

public class RestInvocationHandler implements InvocationHandler {

	private Client rsClient = ClientBuilder.newBuilder().register(BetfairObjectMapper.class).build();
	
	public RestInvocationHandler() {
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		Map<String, Object> requestPayload = new HashMap<>();
		
		Annotation[][] parameterAnnotations = method.getParameterAnnotations();
		for (int i = 0; i < args.length; i++) {
			if (args[i] != null) {
				requestPayload.put(
					((BetfairAPI.Param)parameterAnnotations[i][0]).value(),
					args[i]
				);
			}
		}
		 
		 Response response = rsClient
		.register(new LoggingFilter(Logger.getLogger(Login.class.getName()), true)) //TODO: add logging filter only if debug is enabled
		.target("https://api.betfair.com/exchange/betting/rest/v1.0/")
		.path(method.getName()+"/")
		.request(MediaType.APPLICATION_JSON)
		.header("X-Application", Login.getAppKey())
		.header("X-Authentication", Login.getSessionId())
		.header("Content-Type", MediaType.APPLICATION_JSON)
		.post(
				Entity.entity(requestPayload, MediaType.APPLICATION_JSON)
			);

		 if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
			 throw new RestException(response.getStatusInfo());
		 }
		 
		 return response.readEntity(new GenericType(method.getGenericReturnType())); 
		
	}

}
