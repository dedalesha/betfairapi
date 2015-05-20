package alexei.betfairapi;

import java.lang.reflect.InvocationHandler;

import javax.ws.rs.client.Client;

import alexei.betfairapi.entities.BetfairAPI;

import com.google.inject.AbstractModule;

public class BetfairAPIModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(InvocationHandler.class).to(JaxRsInvocationHandler.class);
		bind(Session.class).to(AutoLogonSession.class);
		bind(Client.class).toProvider(JaxRsClientProvider.class);
		bind(BetfairAPI.class).toProvider(BetfairAPIProvider.class);
	}

}
