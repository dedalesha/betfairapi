	
package alexei.betfairapi.entities;


	/**
	  * The dynamic data about runners in a market. This class was auto-generated from interface definition xml.
	  */
public class Runner {
	
	/**
	  * The unique id of the runner (selection)
	  */
	private Long selectionId;

	/**
	  * The handicap
	  */
	private double handicap;

	/**
	  * The status of the selection (i.e., ACTIVE, REMOVED, WINNER, LOSER)
	  */
	private String status;

	/**
	  * The adjustment factor applied if the selection is removed
	  */
	private double adjustmentFactor;

	/**
	  * The price of the most recent bet matched on this selection
	  */
	private double lastPriceTraded;

	/**
	  * The total amount matched on this runner. This value is truncated at 2dp.
	  */
	private double totalMatched;

	/**
	  * If date and time the runner was removed
	  */
	private java.util.Date removalDate;

	/**
	  * The BSP related prices for this runner
	  */
	private StartingPrices sp;

	/**
	  * The Exchange prices available for this runner
	  */
	private ExchangePrices ex;

	/**
	  * List of orders in the market
	  */
	private java.util.List<Order> orders;

	/**
	  * List of matches (i.e, orders that have been fully or partially executed)
	  */
	private java.util.List<Match> matches;

	/**
	  * The unique id of the runner (selection)
	  */
	public Long getSelectionId() {
		return selectionId;
	}

	/**
	  * The unique id of the runner (selection)
	  */
	public void setSelectionId(Long selectionId) {
		this.selectionId = selectionId;
	}

	/**
	  * The handicap
	  */
	public double getHandicap() {
		return handicap;
	}

	/**
	  * The handicap
	  */
	public void setHandicap(double handicap) {
		this.handicap = handicap;
	}

	/**
	  * The status of the selection (i.e., ACTIVE, REMOVED, WINNER, LOSER)
	  */
	public String getStatus() {
		return status;
	}

	/**
	  * The status of the selection (i.e., ACTIVE, REMOVED, WINNER, LOSER)
	  */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	  * The adjustment factor applied if the selection is removed
	  */
	public double getAdjustmentFactor() {
		return adjustmentFactor;
	}

	/**
	  * The adjustment factor applied if the selection is removed
	  */
	public void setAdjustmentFactor(double adjustmentFactor) {
		this.adjustmentFactor = adjustmentFactor;
	}

	/**
	  * The price of the most recent bet matched on this selection
	  */
	public double getLastPriceTraded() {
		return lastPriceTraded;
	}

	/**
	  * The price of the most recent bet matched on this selection
	  */
	public void setLastPriceTraded(double lastPriceTraded) {
		this.lastPriceTraded = lastPriceTraded;
	}

	/**
	  * The total amount matched on this runner. This value is truncated at 2dp.
	  */
	public double getTotalMatched() {
		return totalMatched;
	}

	/**
	  * The total amount matched on this runner. This value is truncated at 2dp.
	  */
	public void setTotalMatched(double totalMatched) {
		this.totalMatched = totalMatched;
	}

	/**
	  * If date and time the runner was removed
	  */
	public java.util.Date getRemovalDate() {
		return removalDate;
	}

	/**
	  * If date and time the runner was removed
	  */
	public void setRemovalDate(java.util.Date removalDate) {
		this.removalDate = removalDate;
	}

	/**
	  * The BSP related prices for this runner
	  */
	public StartingPrices getSp() {
		return sp;
	}

	/**
	  * The BSP related prices for this runner
	  */
	public void setSp(StartingPrices sp) {
		this.sp = sp;
	}

	/**
	  * The Exchange prices available for this runner
	  */
	public ExchangePrices getEx() {
		return ex;
	}

	/**
	  * The Exchange prices available for this runner
	  */
	public void setEx(ExchangePrices ex) {
		this.ex = ex;
	}

	/**
	  * List of orders in the market
	  */
	public java.util.List<Order> getOrders() {
		return orders;
	}

	/**
	  * List of orders in the market
	  */
	public void setOrders(java.util.List<Order> orders) {
		this.orders = orders;
	}

	/**
	  * List of matches (i.e, orders that have been fully or partially executed)
	  */
	public java.util.List<Match> getMatches() {
		return matches;
	}

	/**
	  * List of matches (i.e, orders that have been fully or partially executed)
	  */
	public void setMatches(java.util.List<Match> matches) {
		this.matches = matches;
	}

}
