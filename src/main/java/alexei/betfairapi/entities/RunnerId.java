	
package alexei.betfairapi.entities;


	/**
	  * This object contains the unique identifier for a runner. This class was auto-generated from interface definition xml.
	  */
public class RunnerId {
	
	/**
	  * The id of the market bet on
	  */
	private String marketId;

	/**
	  * The id of the selection bet on
	  */
	private Long selectionId;

	/**
	  * The handicap associated with the runner in case of asian handicap markets, null otherwise.
	  */
	private double handicap;

	/**
	  * The id of the market bet on
	  */
	public String getMarketId() {
		return marketId;
	}

	/**
	  * The id of the market bet on
	  */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	/**
	  * The id of the selection bet on
	  */
	public Long getSelectionId() {
		return selectionId;
	}

	/**
	  * The id of the selection bet on
	  */
	public void setSelectionId(Long selectionId) {
		this.selectionId = selectionId;
	}

	/**
	  * The handicap associated with the runner in case of asian handicap markets, null otherwise.
	  */
	public double getHandicap() {
		return handicap;
	}

	/**
	  * The handicap associated with the runner in case of asian handicap markets, null otherwise.
	  */
	public void setHandicap(double handicap) {
		this.handicap = handicap;
	}

}
