
   	package alexei.betfairapi.entities;
   	
	/**
	  * Market definition
	  * This class was auto-generated from interface definition xml.
	  */
   	public class MarketState {
   	
   		
		/**
		  * marketStatus
		  */
		private String status;

		/**
		  * betDelay
		  */
		private int betDelay;

		/**
		  * bspReconciled
		  */
		private boolean bspReconciled;

		/**
		  * complete
		  */
		private boolean complete;

		/**
		  * inplay
		  */
		private boolean inplay;

		/**
		  * numberActiveOfRunners
		  */
		private int numberOfActiveRunners;

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
		public int getBetDelay() {
			return betDelay;
		}

		/**
		  * betDelay
		  */
		public void setBetDelay(int betDelay) {
			this.betDelay = betDelay;
		}		

		/**
		  * bspReconciled
		  */
		public boolean isBspReconciled() {
			return bspReconciled;
		}

		/**
		  * bspReconciled
		  */
		public void setBspReconciled(boolean bspReconciled) {
			this.bspReconciled = bspReconciled;
		}		

		/**
		  * complete
		  */
		public boolean isComplete() {
			return complete;
		}

		/**
		  * complete
		  */
		public void setComplete(boolean complete) {
			this.complete = complete;
		}		

		/**
		  * inplay
		  */
		public boolean isInplay() {
			return inplay;
		}

		/**
		  * inplay
		  */
		public void setInplay(boolean inplay) {
			this.inplay = inplay;
		}		

		/**
		  * numberActiveOfRunners
		  */
		public int getNumberOfActiveRunners() {
			return numberOfActiveRunners;
		}

		/**
		  * numberActiveOfRunners
		  */
		public void setNumberOfActiveRunners(int numberOfActiveRunners) {
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
  