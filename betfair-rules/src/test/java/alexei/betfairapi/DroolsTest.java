package alexei.betfairapi;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import static org.junit.Assert.*;

public class DroolsTest {

	private String value;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Test
	public void droolsIsPresent() {
		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kContainer = kieServices.getKieClasspathContainer();
		
		StatelessKieSession kSession = kContainer.newStatelessKieSession();
		DroolsTest testObject = new DroolsTest();
		kSession.execute(testObject);
		assertEquals("Drools has not fired", "aValue", testObject.value);
		
	}	
	
}
