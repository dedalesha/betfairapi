	
package alexei.betfairapi.entities;


	/**
	  * An individual bet Match, or rollup by price or avg price. Rollup depends on the requested MatchProjection . This class was auto-generated from interface definition xml.
	  */
public class Match {
	
	/**
	  * Only present if no rollup
	  */
	private String betId;

	/**
	  * Only present if no rollup
	  */
	private String matchId;

	/**
	  * 
	  */
	private String side;

	/**
	  * Either actual match price or avg match price depending on rollup.
	  */
	private double price;

	/**
	  * Size matched at in this fragment, or at this price or avg price depending on rollup
	  */
	private double Size;

	/**
	  * Only present if no rollup
	  */
	private java.util.Date matchDate;

	/**
	  * Only present if no rollup
	  */
	public String getBetId() {
		return betId;
	}

	/**
	  * Only present if no rollup
	  */
	public void setBetId(String betId) {
		this.betId = betId;
	}

	/**
	  * Only present if no rollup
	  */
	public String getMatchId() {
		return matchId;
	}

	/**
	  * Only present if no rollup
	  */
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	/**
	  * 
	  */
	public String getSide() {
		return side;
	}

	/**
	  * 
	  */
	public void setSide(String side) {
		this.side = side;
	}

	/**
	  * Either actual match price or avg match price depending on rollup.
	  */
	public double getPrice() {
		return price;
	}

	/**
	  * Either actual match price or avg match price depending on rollup.
	  */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	  * Size matched at in this fragment, or at this price or avg price depending on rollup
	  */
	public double getSize() {
		return Size;
	}

	/**
	  * Size matched at in this fragment, or at this price or avg price depending on rollup
	  */
	public void setSize(double Size) {
		this.Size = Size;
	}

	/**
	  * Only present if no rollup
	  */
	public java.util.Date getMatchDate() {
		return matchDate;
	}

	/**
	  * Only present if no rollup
	  */
	public void setMatchDate(java.util.Date matchDate) {
		this.matchDate = matchDate;
	}

}
