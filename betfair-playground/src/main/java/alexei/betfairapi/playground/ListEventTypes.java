package alexei.betfairapi.playground;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import alexei.betfair.rules.RulesModule;
import alexei.betfairapi.BetfairAPIModule;
import alexei.betfairapi.entities.BetfairAPI;
import alexei.betfairapi.entities.EventTypeResult;
import alexei.betfairapi.entities.MarketFilter;
import alexei.betfairapi.entities.MarketProjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ListEventTypes {
	
	
	public static void main(String[] args) throws Exception {
		
		Injector injector = Guice.createInjector(new BetfairAPIModule(), new RulesModule());
		BetfairAPI api = injector.getInstance(BetfairAPI.class);
		
		MarketFilter marketFilter = new MarketFilter();
		
		Set<MarketProjection> marketProjection = new HashSet<MarketProjection>();
		marketProjection.add(MarketProjection.EVENT_TYPE);
		
		List<EventTypeResult> eventTypes = api.listEventTypes(marketFilter, null);
		
		for (EventTypeResult eventType : eventTypes) {
			System.out.printf("%s (%s) %s\n", 
					eventType.getEventType().getName(),
					eventType.getEventType().getId(),
					eventType.getMarketCount()
			);
		}
		
	}
	
}
