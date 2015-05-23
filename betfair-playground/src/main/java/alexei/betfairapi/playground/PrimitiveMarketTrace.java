package alexei.betfairapi.playground;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.kie.api.runtime.KieSession;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
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
import alexei.betfairapi.entities.PriceData;
import alexei.betfairapi.entities.PriceProjection;
import alexei.betfairapi.entities.TimeRange;

public class PrimitiveMarketTrace {
	
	
	public static void main(String[] args) throws Exception {
		
		Injector injector = Guice.createInjector(new BetfairAPIModule(), new RulesModule());
		BetfairAPI api = injector.getInstance(BetfairAPI.class);
//		KieSession rules = injector.getInstance(KieSession.class);
		
		MarketFilter marketFilter = new MarketFilter();
		marketFilter.setInPlayOnly(false);
		marketFilter.setEventTypeIds(Collections.singleton("1"));
		TimeRange tr = new TimeRange();
		tr.setFrom(new Date());
		tr.setTo(new Date(System.currentTimeMillis()+1000*60*60*3));
		marketFilter.setMarketStartTime(tr);
		
		Set<MarketProjection> marketProjection = new HashSet<MarketProjection>();
		marketProjection.add(MarketProjection.MARKET_START_TIME);
//		marketProjection.add(MarketProjection.MARKET_DESCRIPTION);
//		marketProjection.add(MarketProjection.RUNNER_METADATA);
		marketProjection.add(MarketProjection.EVENT);
		
		
		List<MarketCatalogue> listMarketCatalogue = api.listMarketCatalogue(marketFilter, marketProjection, MarketSort.MAXIMUM_TRADED, 3, null);
		System.out.println(listMarketCatalogue);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm");
		List<String> marketIds = new ArrayList<>(); 
		for (MarketCatalogue marketCatalogue : listMarketCatalogue) {
			
			System.out.printf("%s %s @%s £%.2f\n", 
					marketCatalogue.getEvent().getName(),  
					marketCatalogue.getMarketName(), 
					sdf.format(marketCatalogue.getMarketStartTime()), 
					marketCatalogue.getTotalMatched());
			marketIds.add(marketCatalogue.getMarketId());
		}
		
		PriceProjection priceProjection = new PriceProjection();
		Set<PriceData> pd = new HashSet<>();
		pd.add(PriceData.EX_BEST_OFFERS);
		pd.add(PriceData.EX_TRADED);
		pd.add(PriceData.SP_AVAILABLE);
		priceProjection.setPriceData(pd);
		
		ObjectMapper om = new ObjectMapper();
		//om.enable(SerializationFeature.INDENT_OUTPUT);
		om.setSerializationInclusion(Include.NON_NULL);
		OutputStream fos = new FileOutputStream("trace.txt");
		while(true) {
			
			fos.write((System.currentTimeMillis()+" ").getBytes());
			List<MarketBook> marketBook = api.listMarketBook(marketIds, priceProjection, null, null, null, null);
			fos.write(om.writeValueAsBytes(marketBook));
			fos.write('\n');
			fos.flush();
			Thread.sleep(1000 - System.currentTimeMillis()%1000);
		
		}
		
//		for (MarketBook abook : marketBook) {
//			rules.insert(abook);
//		}
//		rules.fireAllRules();
	}
	
}
