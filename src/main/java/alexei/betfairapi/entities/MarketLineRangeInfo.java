
   	package alexei.betfairapi.entities;
   	
	/**
	  * Market Line and Range Info
	  * This class was auto-generated from interface definition xml.
	  */
   	public class MarketLineRangeInfo {
   	
   		
		/**
		  * maxPrice
		  */
		private double maxUnitValue;

		/**
		  * minPrice
		  */
		private double minUnitValue;

		/**
		  * interval
		  */
		private double interval;

		/**
		  * unit
		  */
		private String marketUnit;

   		
   		
		/**
		  * maxPrice
		  */
		public double getMaxUnitValue() {
			return maxUnitValue;
		}

		/**
		  * maxPrice
		  */
		public void setMaxUnitValue(double maxUnitValue) {
			this.maxUnitValue = maxUnitValue;
		}		

		/**
		  * minPrice
		  */
		public double getMinUnitValue() {
			return minUnitValue;
		}

		/**
		  * minPrice
		  */
		public void setMinUnitValue(double minUnitValue) {
			this.minUnitValue = minUnitValue;
		}		

		/**
		  * interval
		  */
		public double getInterval() {
			return interval;
		}

		/**
		  * interval
		  */
		public void setInterval(double interval) {
			this.interval = interval;
		}		

		/**
		  * unit
		  */
		public String getMarketUnit() {
			return marketUnit;
		}

		/**
		  * unit
		  */
		public void setMarketUnit(String marketUnit) {
			this.marketUnit = marketUnit;
		}		

   	
   	}
  