	
package alexei.betfairapi.entities;


	/**
	  * Venue Result. This class was auto-generated from interface definition xml.
	  */
public class VenueResult {
	
	/**
	  * Venue
	  */
	private String venue;

	/**
	  * Count of markets associated with this Venue
	  */
	private Integer marketCount;

	/**
	  * Venue
	  */
	public String getVenue() {
		return venue;
	}

	/**
	  * Venue
	  */
	public void setVenue(String venue) {
		this.venue = venue;
	}

	/**
	  * Count of markets associated with this Venue
	  */
	public Integer getMarketCount() {
		return marketCount;
	}

	/**
	  * Count of markets associated with this Venue
	  */
	public void setMarketCount(Integer marketCount) {
		this.marketCount = marketCount;
	}

}
