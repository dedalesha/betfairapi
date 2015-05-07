
   	package alexei.betfairapi.entities;
   	
	/**
	  * A container representing search results.
	  * This class was auto-generated from interface definition xml.
	  */
   	public class ClearedOrderSummaryReport {
   	
   		
		/**
		  * The list of cleared orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
		  */
		private java.util.List<ClearedOrderSummary> clearedOrders;

		/**
		  * Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
		  */
		private boolean moreAvailable;

   		
   		
		/**
		  * The list of cleared orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
		  */
		public java.util.List<ClearedOrderSummary> getClearedOrders() {
			return clearedOrders;
		}

		/**
		  * The list of cleared orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
		  */
		public void setClearedOrders(java.util.List<ClearedOrderSummary> clearedOrders) {
			this.clearedOrders = clearedOrders;
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
  