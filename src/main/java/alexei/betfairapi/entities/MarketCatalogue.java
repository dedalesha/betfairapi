	
package alexei.betfairapi.entities;


	/**
	  * Information about a market. This class was auto-generated from interface definition xml.
	  */
public class MarketCatalogue {
	
	/**
	  * The unique identifier for the market
	  */
	private String marketId;

	/**
	  * The name of the market
	  */
	private String marketName;

	/**
	  * The time this market starts at, only returned when the MARKET_START_TIME enum is passed in the marketProjections
	  */
	private java.util.Date marketStartTime;

	/**
	  * Details about the market
	  */
	private MarketDescription description;

	/**
	  * The total amount of money matched on the market. This value is truncated at 2dp.
	  */
	private double totalMatched;

	/**
	  * The runners (selections) contained in the market
	  */
	private java.util.List<RunnerCatalog> runners;

	/**
	  * The Event Type the market is contained within
	  */
	private EventType eventType;

	/**
	  * The competition the market is contained within. Usually only applies to Football competitions
	  */
	private Competition competition;

	/**
	  * The event the market is contained within
	  */
	private Event event;

	/**
	  * The unique identifier for the market
	  */
	public String getMarketId() {
		return marketId;
	}

	/**
	  * The unique identifier for the market
	  */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	/**
	  * The name of the market
	  */
	public String getMarketName() {
		return marketName;
	}

	/**
	  * The name of the market
	  */
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	/**
	  * The time this market starts at, only returned when the MARKET_START_TIME enum is passed in the marketProjections
	  */
	public java.util.Date getMarketStartTime() {
		return marketStartTime;
	}

	/**
	  * The time this market starts at, only returned when the MARKET_START_TIME enum is passed in the marketProjections
	  */
	public void setMarketStartTime(java.util.Date marketStartTime) {
		this.marketStartTime = marketStartTime;
	}

	/**
	  * Details about the market
	  */
	public MarketDescription getDescription() {
		return description;
	}

	/**
	  * Details about the market
	  */
	public void setDescription(MarketDescription description) {
		this.description = description;
	}

	/**
	  * The total amount of money matched on the market. This value is truncated at 2dp.
	  */
	public double getTotalMatched() {
		return totalMatched;
	}

	/**
	  * The total amount of money matched on the market. This value is truncated at 2dp.
	  */
	public void setTotalMatched(double totalMatched) {
		this.totalMatched = totalMatched;
	}

	/**
	  * The runners (selections) contained in the market
	  */
	public java.util.List<RunnerCatalog> getRunners() {
		return runners;
	}

	/**
	  * The runners (selections) contained in the market
	  */
	public void setRunners(java.util.List<RunnerCatalog> runners) {
		this.runners = runners;
	}

	/**
	  * The Event Type the market is contained within
	  */
	public EventType getEventType() {
		return eventType;
	}

	/**
	  * The Event Type the market is contained within
	  */
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	/**
	  * The competition the market is contained within. Usually only applies to Football competitions
	  */
	public Competition getCompetition() {
		return competition;
	}

	/**
	  * The competition the market is contained within. Usually only applies to Football competitions
	  */
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	/**
	  * The event the market is contained within
	  */
	public Event getEvent() {
		return event;
	}

	/**
	  * The event the market is contained within
	  */
	public void setEvent(Event event) {
		this.event = event;
	}

}
