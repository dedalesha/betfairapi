	
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
	private int marketCount;

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
	public int getMarketCount() {
		return marketCount;
	}

	/**
	  * Count of markets associated with this Venue
	  */
	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}

}
