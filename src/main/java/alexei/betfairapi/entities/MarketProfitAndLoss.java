
   	package alexei.betfairapi.entities;
   	
	/**
	  * Profit and loss in a market
	  * This class was auto-generated from interface definition xml.
	  */
   	public class MarketProfitAndLoss {
   	
   		
		/**
		  * The unique identifier for the market
		  */
		private String marketId;

		/**
		  * The commission rate applied to P&L values. Only returned if netOfCommision option is requested
		  */
		private double commissionApplied;

		/**
		  * Calculated profit and loss data.
		  */
		private java.util.List<RunnerProfitAndLoss> profitAndLosses;

   		
   		
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
		  * The commission rate applied to P&L values. Only returned if netOfCommision option is requested
		  */
		public double getCommissionApplied() {
			return commissionApplied;
		}

		/**
		  * The commission rate applied to P&L values. Only returned if netOfCommision option is requested
		  */
		public void setCommissionApplied(double commissionApplied) {
			this.commissionApplied = commissionApplied;
		}		

		/**
		  * Calculated profit and loss data.
		  */
		public java.util.List<RunnerProfitAndLoss> getProfitAndLosses() {
			return profitAndLosses;
		}

		/**
		  * Calculated profit and loss data.
		  */
		public void setProfitAndLosses(java.util.List<RunnerProfitAndLoss> profitAndLosses) {
			this.profitAndLosses = profitAndLosses;
		}		

   	
   	}
  