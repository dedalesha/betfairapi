
   	package alexei.betfairapi.entities;
   	
	/**
	  * TimeRange Result
	  * This class was auto-generated from interface definition xml.
	  */
   	public class TimeRangeResult {
   	
   		
		/**
		  * TimeRange
		  */
		private TimeRange timeRange;

		/**
		  * Count of markets associated with this TimeRange
		  */
		private int marketCount;

   		
   		
		/**
		  * TimeRange
		  */
		public TimeRange getTimeRange() {
			return timeRange;
		}

		/**
		  * TimeRange
		  */
		public void setTimeRange(TimeRange timeRange) {
			this.timeRange = timeRange;
		}		

		/**
		  * Count of markets associated with this TimeRange
		  */
		public int getMarketCount() {
			return marketCount;
		}

		/**
		  * Count of markets associated with this TimeRange
		  */
		public void setMarketCount(int marketCount) {
			this.marketCount = marketCount;
		}		

   	
   	}
  