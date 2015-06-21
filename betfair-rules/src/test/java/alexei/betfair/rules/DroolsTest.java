package alexei.betfair.rules;


import org.junit.Before;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

import alexei.betfair.rule.services.RuleServices;
import static org.mockito.Mockito.*;

public class DroolsTest {

	KieSession kSession; 
	RuleServices ruleServices = mock(RuleServices.class);

	@Before
	public void setupSession() {
		BetfairRulesSessionFactory sf = new BetfairRulesSessionFactory();
		sf.setRuleServices(ruleServices);
		kSession = sf.createSession();
	}
	
	@Test
	public void respondsToStartCommand() {
		
		kSession.insert(new StartEvent());
		
		kSession.fireAllRules();

		verify(ruleServices).ruleEngineStarted();
	}	
	
}
