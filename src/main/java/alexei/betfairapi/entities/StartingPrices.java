
   	package alexei.betfairapi.entities;
   	
	/**
	  * Information about the Betfair Starting Price. Only available in BSP markets
	  * This class was auto-generated from interface definition xml.
	  */
   	public class StartingPrices {
   	
   		
		/**
		  * What the starting price would be if the market was reconciled now taking into account the SP bets as well as unmatched exchange bets on the same selection in the exchange.
		  */
		private double nearPrice;

		/**
		  * What the starting price would be if the market was reconciled now taking into account only the currently place SP bets. The Far Price is not as complicated but not as accurate and only accounts for money on the exchange at SP.
		  */
		private double farPrice;

		/**
		  * 
		  */
		private java.util.List<PriceSize> backStakeTaken;

		/**
		  * 
		  */
		private java.util.List<PriceSize> layLiabilityTaken;

		/**
		  * The final BSP price for this runner. Only available for a BSP market that has been reconciled.
		  */
		private double actualSP;

   		
   		
		/**
		  * What the starting price would be if the market was reconciled now taking into account the SP bets as well as unmatched exchange bets on the same selection in the exchange.
		  */
		public double getNearPrice() {
			return nearPrice;
		}

		/**
		  * What the starting price would be if the market was reconciled now taking into account the SP bets as well as unmatched exchange bets on the same selection in the exchange.
		  */
		public void setNearPrice(double nearPrice) {
			this.nearPrice = nearPrice;
		}		

		/**
		  * What the starting price would be if the market was reconciled now taking into account only the currently place SP bets. The Far Price is not as complicated but not as accurate and only accounts for money on the exchange at SP.
		  */
		public double getFarPrice() {
			return farPrice;
		}

		/**
		  * What the starting price would be if the market was reconciled now taking into account only the currently place SP bets. The Far Price is not as complicated but not as accurate and only accounts for money on the exchange at SP.
		  */
		public void setFarPrice(double farPrice) {
			this.farPrice = farPrice;
		}		

		/**
		  * 
		  */
		public java.util.List<PriceSize> getBackStakeTaken() {
			return backStakeTaken;
		}

		/**
		  * 
		  */
		public void setBackStakeTaken(java.util.List<PriceSize> backStakeTaken) {
			this.backStakeTaken = backStakeTaken;
		}		

		/**
		  * 
		  */
		public java.util.List<PriceSize> getLayLiabilityTaken() {
			return layLiabilityTaken;
		}

		/**
		  * 
		  */
		public void setLayLiabilityTaken(java.util.List<PriceSize> layLiabilityTaken) {
			this.layLiabilityTaken = layLiabilityTaken;
		}		

		/**
		  * The final BSP price for this runner. Only available for a BSP market that has been reconciled.
		  */
		public double getActualSP() {
			return actualSP;
		}

		/**
		  * The final BSP price for this runner. Only available for a BSP market that has been reconciled.
		  */
		public void setActualSP(double actualSP) {
			this.actualSP = actualSP;
		}		

   	
   	}
  