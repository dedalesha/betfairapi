	
package alexei.betfairapi.entities;


	/**
	  * Event Result. This class was auto-generated from interface definition xml.
	  */
public class EventResult {
	
	/**
	  * Event
	  */
	private Event event;

	/**
	  * Count of markets associated with this event
	  */
	private int marketCount;

	/**
	  * Event
	  */
	public Event getEvent() {
		return event;
	}

	/**
	  * Event
	  */
	public void setEvent(Event event) {
		this.event = event;
	}

	/**
	  * Count of markets associated with this event
	  */
	public int getMarketCount() {
		return marketCount;
	}

	/**
	  * Count of markets associated with this event
	  */
	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}

}
