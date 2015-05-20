package alexei.betfairapi.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.kie.api.runtime.KieSession;

import com.google.inject.Guice;
import com.google.inject.Injector;

import alexei.betfair.rules.RulesModule;
import alexei.betfairapi.BetfairAPIModule;
import alexei.betfairapi.entities.BetfairAPI;
import alexei.betfairapi.entities.MarketBook;
import alexei.betfairapi.entities.MarketCatalogue;
import alexei.betfairapi.entities.MarketFilter;
import alexei.betfairapi.entities.MarketProjection;
import alexei.betfairapi.entities.MarketSort;

public class MarketOperations {
	
	
	public static void main(String[] args) throws Exception {
		
		Injector injector = Guice.createInjector(new BetfairAPIModule(), new RulesModule());
		BetfairAPI api = injector.getInstance(BetfairAPI.class);
		KieSession rules = injector.getInstance(KieSession.class);
		
		MarketFilter marketFilter = new MarketFilter();
		marketFilter.setInPlayOnly(true);
		marketFilter.setEventTypeIds(Collections.singleton("1"));
		
		Set<MarketProjection> marketProjection = new HashSet<MarketProjection>();
		marketProjection.add(MarketProjection.EVENT_TYPE);
		
		List<MarketCatalogue> listMarketCatalogue = api.listMarketCatalogue(marketFilter, marketProjection, MarketSort.MAXIMUM_TRADED, 20, null);
		System.out.println(listMarketCatalogue);
		
		List<String> marketIds = new ArrayList<>(); 
		for (MarketCatalogue marketCatalogue : listMarketCatalogue) {
			marketIds.add(marketCatalogue.getMarketId());
		}
		
		List<MarketBook> marketBook = api.listMarketBook(marketIds, null, null, null, null, null);
		for (MarketBook abook : marketBook) {
			rules.insert(abook);
		}
		rules.fireAllRules();
	}
	
}
