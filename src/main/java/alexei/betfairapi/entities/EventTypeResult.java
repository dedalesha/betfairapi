
   	package alexei.betfairapi.entities;
   	
	/**
	  * EventType Result
	  * This class was auto-generated from interface definition xml.
	  */
   	public class EventTypeResult {
   	
   		
		/**
		  * EventType
		  */
		private EventType eventType;

		/**
		  * Count of markets associated with this eventType
		  */
		private int marketCount;

   		
   		
		/**
		  * EventType
		  */
		public EventType getEventType() {
			return eventType;
		}

		/**
		  * EventType
		  */
		public void setEventType(EventType eventType) {
			this.eventType = eventType;
		}		

		/**
		  * Count of markets associated with this eventType
		  */
		public int getMarketCount() {
			return marketCount;
		}

		/**
		  * Count of markets associated with this eventType
		  */
		public void setMarketCount(int marketCount) {
			this.marketCount = marketCount;
		}		

   	
   	}
  