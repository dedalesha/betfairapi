	
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
	private boolean isMarketDataDelayed;

	/**
	  * The status of the market, for example ACTIVE, SUSPENDED, SETTLED, etc.
	  */
	private String status;

	/**
	  * The number of seconds an order is held until it is submitted into the market. Orders are usually delayed when the market is in-play
	  */
	private int betDelay;

	/**
	  * True if the market starting price has been reconciled
	  */
	private boolean bspReconciled;

	/**
	  * 
	  */
	private boolean complete;

	/**
	  * True if the market is currently in play
	  */
	private boolean inplay;

	/**
	  * The number of selections that could be settled as winners
	  */
	private int numberOfWinners;

	/**
	  * The number of runners in the market
	  */
	private int numberOfRunners;

	/**
	  * The number of runners that are currently active. An active runner is a selection available for betting
	  */
	private int numberOfActiveRunners;

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
	private boolean crossMatching;

	/**
	  * True if runners in the market can be voided
	  */
	private boolean runnersVoidable;

	/**
	  * The version of the market. The version increments whenever the market status changes, for example, turning in-play, or suspended when a goal score.
	  */
	private long version;

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
	public boolean isIsMarketDataDelayed() {
		return isMarketDataDelayed;
	}

	/**
	  * True if the data returned by listMarketBook will be delayed. The data may be delayed because you are not logged in with a funded account or you are using an Application Key that does not allow up to date data.
	  */
	public void setIsMarketDataDelayed(boolean isMarketDataDelayed) {
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
	public int getBetDelay() {
		return betDelay;
	}

	/**
	  * The number of seconds an order is held until it is submitted into the market. Orders are usually delayed when the market is in-play
	  */
	public void setBetDelay(int betDelay) {
		this.betDelay = betDelay;
	}

	/**
	  * True if the market starting price has been reconciled
	  */
	public boolean isBspReconciled() {
		return bspReconciled;
	}

	/**
	  * True if the market starting price has been reconciled
	  */
	public void setBspReconciled(boolean bspReconciled) {
		this.bspReconciled = bspReconciled;
	}

	/**
	  * 
	  */
	public boolean isComplete() {
		return complete;
	}

	/**
	  * 
	  */
	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	/**
	  * True if the market is currently in play
	  */
	public boolean isInplay() {
		return inplay;
	}

	/**
	  * True if the market is currently in play
	  */
	public void setInplay(boolean inplay) {
		this.inplay = inplay;
	}

	/**
	  * The number of selections that could be settled as winners
	  */
	public int getNumberOfWinners() {
		return numberOfWinners;
	}

	/**
	  * The number of selections that could be settled as winners
	  */
	public void setNumberOfWinners(int numberOfWinners) {
		this.numberOfWinners = numberOfWinners;
	}

	/**
	  * The number of runners in the market
	  */
	public int getNumberOfRunners() {
		return numberOfRunners;
	}

	/**
	  * The number of runners in the market
	  */
	public void setNumberOfRunners(int numberOfRunners) {
		this.numberOfRunners = numberOfRunners;
	}

	/**
	  * The number of runners that are currently active. An active runner is a selection available for betting
	  */
	public int getNumberOfActiveRunners() {
		return numberOfActiveRunners;
	}

	/**
	  * The number of runners that are currently active. An active runner is a selection available for betting
	  */
	public void setNumberOfActiveRunners(int numberOfActiveRunners) {
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
	public boolean isCrossMatching() {
		return crossMatching;
	}

	/**
	  * True if cross matching is enabled for this market.
	  */
	public void setCrossMatching(boolean crossMatching) {
		this.crossMatching = crossMatching;
	}

	/**
	  * True if runners in the market can be voided
	  */
	public boolean isRunnersVoidable() {
		return runnersVoidable;
	}

	/**
	  * True if runners in the market can be voided
	  */
	public void setRunnersVoidable(boolean runnersVoidable) {
		this.runnersVoidable = runnersVoidable;
	}

	/**
	  * The version of the market. The version increments whenever the market status changes, for example, turning in-play, or suspended when a goal score.
	  */
	public long getVersion() {
		return version;
	}

	/**
	  * The version of the market. The version increments whenever the market status changes, for example, turning in-play, or suspended when a goal score.
	  */
	public void setVersion(long version) {
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
