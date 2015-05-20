package alexei.betfairapi;

import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.filter.LoggingFilter;

import com.google.inject.Provider;

public class JaxRsClientProvider implements Provider<Client>{

	@Override
	public Client get() {
		return ClientBuilder.newBuilder()
				.register(new LoggingFilter(Logger.getLogger(AutoLogonSession.class.getName()), true))
				.register(ObjectMapperResolver.class)
				.build();
	}

}
