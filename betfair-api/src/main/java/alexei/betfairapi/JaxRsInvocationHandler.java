package alexei.betfairapi;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import alexei.betfairapi.entities.BetfairAPI;

public class JaxRsInvocationHandler implements InvocationHandler {

	private final static Logger LOG = Logger.getLogger(JaxRsInvocationHandler.class.getName());
	
	private Session session;
	private Client client;
	
	@Inject
	public JaxRsInvocationHandler(Session session, Client jaxRsClient) {
		this.session = session;
		this.client = jaxRsClient;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		LOG.log(Level.FINER, "Preparing invocation of {0} method", method.getName());

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
		 
		 Invocation invocation = client
		.target("https://api.betfair.com/exchange/betting/rest/v1.0/")
		.path(method.getName()+"/")
		.request(MediaType.APPLICATION_JSON)
		.header("X-Application", session.getAppKey())
		.header("X-Authentication", session.getSessionToken())
		.header("Content-Type", MediaType.APPLICATION_JSON)
		.buildPost(
				Entity.entity(requestPayload, MediaType.APPLICATION_JSON)
			);

		 Response response = invocation.invoke();
		 
		 if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
			 if (response.getStatusInfo().getFamily() == Family.CLIENT_ERROR) {
				 APINGClientErrorResponse apingErrorDetail = response.readEntity(APINGClientErrorResponse.class);
				 throw new RestException(method.getName(), response, apingErrorDetail);				 
			 }
			 throw new RestException(method.getName(), response);
		 }
		 
		 LOG.log(Level.FINER, "Invocation of {0} was successful", method.getName());
		 
		 return response.readEntity(new GenericType(method.getGenericReturnType())); 
		
	}

}
