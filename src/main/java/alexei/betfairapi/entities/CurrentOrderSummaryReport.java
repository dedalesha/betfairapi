
   	package alexei.betfairapi.entities;
   	
	/**
	  * A container representing search results.
	  * This class was auto-generated from interface definition xml.
	  */
   	public class CurrentOrderSummaryReport {
   	
   		
		/**
		  * The list of current orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
		  */
		private java.util.List<CurrentOrderSummary> currentOrders;

		/**
		  * Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
		  */
		private boolean moreAvailable;

   		
   		
		/**
		  * The list of current orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
		  */
		public java.util.List<CurrentOrderSummary> getCurrentOrders() {
			return currentOrders;
		}

		/**
		  * The list of current orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
		  */
		public void setCurrentOrders(java.util.List<CurrentOrderSummary> currentOrders) {
			this.currentOrders = currentOrders;
		}		

		/**
		  * Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
		  */
		public boolean isMoreAvailable() {
			return moreAvailable;
		}

		/**
		  * Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
		  */
		public void setMoreAvailable(boolean moreAvailable) {
			this.moreAvailable = moreAvailable;
		}		

   	
   	}
  