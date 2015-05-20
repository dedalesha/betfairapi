package alexei.betfairapi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import javax.inject.Inject;

import alexei.betfairapi.entities.BetfairAPI;

import com.google.inject.Provider;

public class BetfairAPIProvider implements Provider<BetfairAPI> {

	private InvocationHandler handler;
	
	@Inject
	public void setHandler(InvocationHandler handler) {
		this.handler = handler;
	}

	@Override
	public BetfairAPI get() {
		return (BetfairAPI) Proxy.newProxyInstance(BetfairAPI.class.getClassLoader(), new Class[] {BetfairAPI.class}, handler);
	}

}
