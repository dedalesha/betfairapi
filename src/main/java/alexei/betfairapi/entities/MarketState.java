	
package alexei.betfairapi.entities;


	/**
	  * Market definition. This class was auto-generated from interface definition xml.
	  */
public class MarketState {
	
	/**
	  * marketStatus
	  */
	private String status;

	/**
	  * betDelay
	  */
	private Integer betDelay;

	/**
	  * bspReconciled
	  */
	private Boolean bspReconciled;

	/**
	  * complete
	  */
	private Boolean complete;

	/**
	  * inplay
	  */
	private Boolean inplay;

	/**
	  * numberActiveOfRunners
	  */
	private Integer numberOfActiveRunners;

	/**
	  * lastMatchTime
	  */
	private java.util.Date lastMatchTime;

	/**
	  * 
	  */
	private double totalMatched;

	/**
	  * Zero for closed markets
	  */
	private double totalAvailable;

	/**
	  * marketStatus
	  */
	public String getStatus() {
		return status;
	}

	/**
	  * marketStatus
	  */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	  * betDelay
	  */
	public Integer getBetDelay() {
		return betDelay;
	}

	/**
	  * betDelay
	  */
	public void setBetDelay(Integer betDelay) {
		this.betDelay = betDelay;
	}

	/**
	  * bspReconciled
	  */
	public Boolean isBspReconciled() {
		return bspReconciled;
	}

	/**
	  * bspReconciled
	  */
	public void setBspReconciled(Boolean bspReconciled) {
		this.bspReconciled = bspReconciled;
	}

	/**
	  * complete
	  */
	public Boolean isComplete() {
		return complete;
	}

	/**
	  * complete
	  */
	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	/**
	  * inplay
	  */
	public Boolean isInplay() {
		return inplay;
	}

	/**
	  * inplay
	  */
	public void setInplay(Boolean inplay) {
		this.inplay = inplay;
	}

	/**
	  * numberActiveOfRunners
	  */
	public Integer getNumberOfActiveRunners() {
		return numberOfActiveRunners;
	}

	/**
	  * numberActiveOfRunners
	  */
	public void setNumberOfActiveRunners(Integer numberOfActiveRunners) {
		this.numberOfActiveRunners = numberOfActiveRunners;
	}

	/**
	  * lastMatchTime
	  */
	public java.util.Date getLastMatchTime() {
		return lastMatchTime;
	}

	/**
	  * lastMatchTime
	  */
	public void setLastMatchTime(java.util.Date lastMatchTime) {
		this.lastMatchTime = lastMatchTime;
	}

	/**
	  * 
	  */
	public double getTotalMatched() {
		return totalMatched;
	}

	/**
	  * 
	  */
	public void setTotalMatched(double totalMatched) {
		this.totalMatched = totalMatched;
	}

	/**
	  * Zero for closed markets
	  */
	public double getTotalAvailable() {
		return totalAvailable;
	}

	/**
	  * Zero for closed markets
	  */
	public void setTotalAvailable(double totalAvailable) {
		this.totalAvailable = totalAvailable;
	}

}
