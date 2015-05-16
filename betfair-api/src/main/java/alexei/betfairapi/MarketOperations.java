package alexei.betfairapi;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import alexei.betfairapi.entities.BetfairAPI;
import alexei.betfairapi.entities.EventResult;
import alexei.betfairapi.entities.MarketCatalogue;
import alexei.betfairapi.entities.MarketFilter;
import alexei.betfairapi.entities.MarketProjection;
import alexei.betfairapi.entities.MarketSort;

public class MarketOperations {
	
	public void listFootballMarkets() {

		ApiFactory f = new ApiFactory();
		
		BetfairAPI api = f.getInstance();
		
		MarketFilter marketFilter = new MarketFilter();
		Set<MarketProjection> marketProjection = new HashSet<MarketProjection>();
		marketProjection.add(MarketProjection.EVENT_TYPE);
		
		List<MarketCatalogue> listMarketCatalogue = api.listMarketCatalogue(marketFilter, marketProjection, MarketSort.MAXIMUM_TRADED, 20, null);
		System.out.println(listMarketCatalogue);
		
		marketFilter.setEventTypeIds(Collections.singleton("1"));
		marketFilter.setInPlayOnly(true);
		List<EventResult> events = api.listEvents(marketFilter, null);
		System.out.println(events);
		System.out.println(events.size());
	}
	
	public static void main(String[] args) {
		Login.login();
		MarketOperations operations = new MarketOperations();
		operations.listFootballMarkets();
	}
	
}
