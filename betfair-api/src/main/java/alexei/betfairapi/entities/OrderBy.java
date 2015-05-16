
   	package alexei.betfairapi.entities;
   	
   	public enum OrderBy {
   	
   		
		/**
		  * @Deprecated Use BY_PLACE_TIME instead. Order by placed time, then bet id.
		  */
		BY_BET,
		
		/**
		  * Order by market id, then placed time, then bet id.
		  */
		BY_MARKET,
		
		/**
		  * Order by placed time, then bet id. This is an alias of to be deprecated BY_BET.
		  */
		BY_PLACE_TIME,
		
		/**
		  * Order by time of last matched fragment (if any), then placed time, then bet id. Filters out orders which have no matched date
		  */
		BY_MATCH_TIME,
		
		/**
		  * Order by time of last voided fragment (if any), then by last match time, then placed time, then bet id. Filters out orders which have not been voided.
		  */
		BY_VOID_TIME,
		
		/**
		  * Order by time of last settled fragment (if any), then by last match time, then placed time, then bet id. Filters out orders which have not been settled.
		  */
		BY_SETTLED_TIME
   	
   	}
  