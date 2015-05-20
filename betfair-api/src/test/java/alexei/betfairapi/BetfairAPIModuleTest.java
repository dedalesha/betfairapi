package alexei.betfairapi;

import org.junit.Assert;
import org.junit.Test;

import alexei.betfairapi.entities.BetfairAPI;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BetfairAPIModuleTest {

	@Test
	public void shouldInitializeWithoutExceptions() {
		Injector injector = Guice.createInjector(new BetfairAPIModule());
		BetfairAPI betfairAPI = injector.getInstance(BetfairAPI.class);
		Assert.assertNotNull("Betfair API instance has not been returned from the application context", betfairAPI);
	}
	
}
