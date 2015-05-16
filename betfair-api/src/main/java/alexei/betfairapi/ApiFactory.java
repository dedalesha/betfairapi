package alexei.betfairapi;

import java.lang.reflect.Proxy;

import alexei.betfairapi.entities.BetfairAPI;

public class ApiFactory {

	public BetfairAPI getInstance() {
		RestInvocationHandler handler = new RestInvocationHandler();
		return (BetfairAPI) Proxy.newProxyInstance(BetfairAPI.class.getClassLoader(), new Class[] {BetfairAPI.class}, handler);
	}
	
}
