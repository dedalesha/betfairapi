package alexei.betfair.rules;


import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import alexei.betfairapi.entities.MarketBook;

public class DroolsTest {

	@Test
	public void droolsIsPresent() {
		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kContainer = kieServices.getKieClasspathContainer();
		
		StatelessKieSession kSession = kContainer.newStatelessKieSession();
		
		MarketBook marketBook = new MarketBook();
		marketBook.setInplay(true);
		kSession.execute(marketBook);
		
	}	
	
}
