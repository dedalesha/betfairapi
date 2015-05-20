package alexei.betfair.rules;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class RulesModule extends AbstractModule {

	@Override
	protected void configure() {
		
	}
	
	@Provides
	KieSession createKieSession() {
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kContainer = kieServices.getKieClasspathContainer();
		return kContainer.newKieSession();
	}

}
