
   	package alexei.betfairapi.entities;
   	
	/**
	  * CountryCode Result
	  * This class was auto-generated from interface definition xml.
	  */
   	public class CountryCodeResult {
   	
   		
		/**
		  * Country Code
		  */
		private String countryCode;

		/**
		  * Count of markets associated with this Country Code
		  */
		private int marketCount;

   		
   		
		/**
		  * Country Code
		  */
		public String getCountryCode() {
			return countryCode;
		}

		/**
		  * Country Code
		  */
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}		

		/**
		  * Count of markets associated with this Country Code
		  */
		public int getMarketCount() {
			return marketCount;
		}

		/**
		  * Count of markets associated with this Country Code
		  */
		public void setMarketCount(int marketCount) {
			this.marketCount = marketCount;
		}		

   	
   	}
  