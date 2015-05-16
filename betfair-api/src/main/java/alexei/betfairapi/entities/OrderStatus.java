
   	package alexei.betfairapi.entities;
   	
   	public enum OrderStatus {
   	
   		
		/**
		  * An order that does not have any remaining unmatched portion.
		  */
		EXECUTION_COMPLETE,
		
		/**
		  * An order that has a remaining unmatched portion.
		  */
		EXECUTABLE
   	
   	}
  