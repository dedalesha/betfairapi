	
package alexei.betfairapi.entities;


	/**
	  * The dynamic data in a market. This class was auto-generated from interface definition xml.
	  */
public class MarketBook {
	
	/**
	  * The unique identifier for the market
	  */
	private String marketId;

	/**
	  * True if the data returned by listMarketBook will be delayed. The data may be delayed because you are not logged in with a funded account or you are using an Application Key that does not allow up to date data.
	  */
	private Boolean isMarketDataDelayed;

	/**
	  * The status of the market, for example ACTIVE, SUSPENDED, SETTLED, etc.
	  */
	private String status;

	/**
	  * The number of seconds an order is held until it is submitted into the market. Orders are usually delayed when the market is in-play
	  */
	private Integer betDelay;

	/**
	  * True if the market starting price has been reconciled
	  */
	private Boolean bspReconciled;

	/**
	  * 
	  */
	private Boolean complete;

	/**
	  * True if the market is currently in play
	  */
	private Boolean inplay;

	/**
	  * The number of selections that could be settled as winners
	  */
	private Integer numberOfWinners;

	/**
	  * The number of runners in the market
	  */
	private Integer numberOfRunners;

	/**
	  * The number of runners that are currently active. An active runner is a selection available for betting
	  */
	private Integer numberOfActiveRunners;

	/**
	  * The most recent time an order was executed
	  */
	private java.util.Date lastMatchTime;

	/**
	  * The total amount matched. This value is truncated at 2dp.
	  */
	private double totalMatched;

	/**
	  * The total amount of orders that remain unmatched. This value is truncated at 2dp.
	  */
	private double totalAvailable;

	/**
	  * True if cross matching is enabled for this market.
	  */
	private Boolean crossMatching;

	/**
	  * True if runners in the market can be voided
	  */
	private Boolean runnersVoidable;

	/**
	  * The version of the market. The version increments whenever the market status changes, for example, turning in-play, or suspended when a goal score.
	  */
	private Long version;

	/**
	  * Information about the runners (selections) in the market.
	  */
	private java.util.List<Runner> runners;

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
	  * True if the data returned by listMarketBook will be delayed. The data may be delayed because you are not logged in with a funded account or you are using an Application Key that does not allow up to date data.
	  */
	public Boolean isIsMarketDataDelayed() {
		return isMarketDataDelayed;
	}

	/**
	  * True if the data returned by listMarketBook will be delayed. The data may be delayed because you are not logged in with a funded account or you are using an Application Key that does not allow up to date data.
	  */
	public void setIsMarketDataDelayed(Boolean isMarketDataDelayed) {
		this.isMarketDataDelayed = isMarketDataDelayed;
	}

	/**
	  * The status of the market, for example ACTIVE, SUSPENDED, SETTLED, etc.
	  */
	public String getStatus() {
		return status;
	}

	/**
	  * The status of the market, for example ACTIVE, SUSPENDED, SETTLED, etc.
	  */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	  * The number of seconds an order is held until it is submitted into the market. Orders are usually delayed when the market is in-play
	  */
	public Integer getBetDelay() {
		return betDelay;
	}

	/**
	  * The number of seconds an order is held until it is submitted into the market. Orders are usually delayed when the market is in-play
	  */
	public void setBetDelay(Integer betDelay) {
		this.betDelay = betDelay;
	}

	/**
	  * True if the market starting price has been reconciled
	  */
	public Boolean isBspReconciled() {
		return bspReconciled;
	}

	/**
	  * True if the market starting price has been reconciled
	  */
	public void setBspReconciled(Boolean bspReconciled) {
		this.bspReconciled = bspReconciled;
	}

	/**
	  * 
	  */
	public Boolean isComplete() {
		return complete;
	}

	/**
	  * 
	  */
	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	/**
	  * True if the market is currently in play
	  */
	public Boolean isInplay() {
		return inplay;
	}

	/**
	  * True if the market is currently in play
	  */
	public void setInplay(Boolean inplay) {
		this.inplay = inplay;
	}

	/**
	  * The number of selections that could be settled as winners
	  */
	public Integer getNumberOfWinners() {
		return numberOfWinners;
	}

	/**
	  * The number of selections that could be settled as winners
	  */
	public void setNumberOfWinners(Integer numberOfWinners) {
		this.numberOfWinners = numberOfWinners;
	}

	/**
	  * The number of runners in the market
	  */
	public Integer getNumberOfRunners() {
		return numberOfRunners;
	}

	/**
	  * The number of runners in the market
	  */
	public void setNumberOfRunners(Integer numberOfRunners) {
		this.numberOfRunners = numberOfRunners;
	}

	/**
	  * The number of runners that are currently active. An active runner is a selection available for betting
	  */
	public Integer getNumberOfActiveRunners() {
		return numberOfActiveRunners;
	}

	/**
	  * The number of runners that are currently active. An active runner is a selection available for betting
	  */
	public void setNumberOfActiveRunners(Integer numberOfActiveRunners) {
		this.numberOfActiveRunners = numberOfActiveRunners;
	}

	/**
	  * The most recent time an order was executed
	  */
	public java.util.Date getLastMatchTime() {
		return lastMatchTime;
	}

	/**
	  * The most recent time an order was executed
	  */
	public void setLastMatchTime(java.util.Date lastMatchTime) {
		this.lastMatchTime = lastMatchTime;
	}

	/**
	  * The total amount matched. This value is truncated at 2dp.
	  */
	public double getTotalMatched() {
		return totalMatched;
	}

	/**
	  * The total amount matched. This value is truncated at 2dp.
	  */
	public void setTotalMatched(double totalMatched) {
		this.totalMatched = totalMatched;
	}

	/**
	  * The total amount of orders that remain unmatched. This value is truncated at 2dp.
	  */
	public double getTotalAvailable() {
		return totalAvailable;
	}

	/**
	  * The total amount of orders that remain unmatched. This value is truncated at 2dp.
	  */
	public void setTotalAvailable(double totalAvailable) {
		this.totalAvailable = totalAvailable;
	}

	/**
	  * True if cross matching is enabled for this market.
	  */
	public Boolean isCrossMatching() {
		return crossMatching;
	}

	/**
	  * True if cross matching is enabled for this market.
	  */
	public void setCrossMatching(Boolean crossMatching) {
		this.crossMatching = crossMatching;
	}

	/**
	  * True if runners in the market can be voided
	  */
	public Boolean isRunnersVoidable() {
		return runnersVoidable;
	}

	/**
	  * True if runners in the market can be voided
	  */
	public void setRunnersVoidable(Boolean runnersVoidable) {
		this.runnersVoidable = runnersVoidable;
	}

	/**
	  * The version of the market. The version increments whenever the market status changes, for example, turning in-play, or suspended when a goal score.
	  */
	public Long getVersion() {
		return version;
	}

	/**
	  * The version of the market. The version increments whenever the market status changes, for example, turning in-play, or suspended when a goal score.
	  */
	public void setVersion(Long version) {
		this.version = version;
	}

	/**
	  * Information about the runners (selections) in the market.
	  */
	public java.util.List<Runner> getRunners() {
		return runners;
	}

	/**
	  * Information about the runners (selections) in the market.
	  */
	public void setRunners(java.util.List<Runner> runners) {
		this.runners = runners;
	}

}
