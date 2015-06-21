package alexei.betfair.rules;

import org.kie.api.builder.Message.Level;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import alexei.betfair.rule.services.RuleServices;

public class BetfairRulesSessionFactory {

	private RuleServices ruleServices;
	
	public void setRuleServices(RuleServices ruleServices) {
		this.ruleServices = ruleServices;
	}

	public KieSession createSession() {
		
		KieServices kieServices = KieServices.Factory.get();
		KieRepository kr = kieServices.getRepository();
		KieFileSystem kfs = kieServices.newKieFileSystem();
		kfs.write("src/main/resources/rule.drl", kieServices.getResources().newFileSystemResource("target/classes/InPlayMarkets.drl"));

		KieBuilder kb = kieServices.newKieBuilder(kfs);
		kb.buildAll();
		if (kb.getResults().hasMessages(Level.ERROR)) {
		    throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
		}
		
		KieContainer kContainer = kieServices.newKieContainer(kr.getDefaultReleaseId());
		
		KieSession kSession = kContainer.newKieSession();
		kSession.setGlobal("services", ruleServices);
		
		return kSession;
		
	}

}
