	
package alexei.betfairapi.entities;


	/**
	  * EventType Result. This class was auto-generated from interface definition xml.
	  */
public class EventTypeResult {
	
	/**
	  * EventType
	  */
	private EventType eventType;

	/**
	  * Count of markets associated with this eventType
	  */
	private Integer marketCount;

	/**
	  * EventType
	  */
	public EventType getEventType() {
		return eventType;
	}

	/**
	  * EventType
	  */
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	/**
	  * Count of markets associated with this eventType
	  */
	public Integer getMarketCount() {
		return marketCount;
	}

	/**
	  * Count of markets associated with this eventType
	  */
	public void setMarketCount(Integer marketCount) {
		this.marketCount = marketCount;
	}

}
