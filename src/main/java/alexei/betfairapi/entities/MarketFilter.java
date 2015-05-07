
   	package alexei.betfairapi.entities;
   	
	/**
	  * 
	  * This class was auto-generated from interface definition xml.
	  */
   	public class MarketFilter {
   	
   		
		/**
		  * Restrict markets by any text associated with the market such as the Name, Event, Competition, etc. You can include a wildcard (*) character as long as it is not the first character.
		  */
		private String textQuery;

		/**
		  * Restrict markets by the Exchange where the market operates. Note: This is not currently in use and only entities for the current exchange will be returned.
		  */
		private java.util.Set<String> exchangeIds;

		/**
		  * Restrict markets by event type associated with the market. (i.e., Football, Hockey, etc)
		  */
		private java.util.Set<String> eventTypeIds;

		/**
		  * Restrict markets by the event id associated with the market.
		  */
		private java.util.Set<String> eventIds;

		/**
		  * Restrict markets by the competitions associated with the market.
		  */
		private java.util.Set<String> competitionIds;

		/**
		  * Restrict markets by the market id associated with the market.
		  */
		private java.util.Set<String> marketIds;

		/**
		  * Restrict markets by the venue associated with the market. Currently only Horse Racing markets have venues.
		  */
		private java.util.Set<String> venues;

		/**
		  * Restrict to bsp markets only, if True or non-bsp markets if False. If not specified then returns both BSP and non-BSP markets
		  */
		private boolean bspOnly;

		/**
		  * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
		  */
		private boolean turnInPlayEnabled;

		/**
		  * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
		  */
		private boolean inPlayOnly;

		/**
		  * Restrict to markets that match the betting type of the market (i.e. Odds, Asian Handicap Singles, or Asian Handicap Doubles
		  */
		private java.util.Set<MarketBettingType> marketBettingTypes;

		/**
		  * Restrict to markets that are in the specified country or countries
		  */
		private java.util.Set<String> marketCountries;

		/**
		  * Restrict to markets that match the type of the market (i.e., MATCH_ODDS, HALF_TIME_SCORE). You should use this instead of relying on the market name as the market type codes are the same in all locales
		  */
		private java.util.Set<String> marketTypeCodes;

		/**
		  * Restrict to markets with a market start time before or after the specified date
		  */
		private TimeRange marketStartTime;

		/**
		  * Restrict to markets that I have one or more orders in these status.
		  */
		private java.util.Set<OrderStatus> withOrders;

   		
   		
		/**
		  * Restrict markets by any text associated with the market such as the Name, Event, Competition, etc. You can include a wildcard (*) character as long as it is not the first character.
		  */
		public String getTextQuery() {
			return textQuery;
		}

		/**
		  * Restrict markets by any text associated with the market such as the Name, Event, Competition, etc. You can include a wildcard (*) character as long as it is not the first character.
		  */
		public void setTextQuery(String textQuery) {
			this.textQuery = textQuery;
		}		

		/**
		  * Restrict markets by the Exchange where the market operates. Note: This is not currently in use and only entities for the current exchange will be returned.
		  */
		public java.util.Set<String> getExchangeIds() {
			return exchangeIds;
		}

		/**
		  * Restrict markets by the Exchange where the market operates. Note: This is not currently in use and only entities for the current exchange will be returned.
		  */
		public void setExchangeIds(java.util.Set<String> exchangeIds) {
			this.exchangeIds = exchangeIds;
		}		

		/**
		  * Restrict markets by event type associated with the market. (i.e., Football, Hockey, etc)
		  */
		public java.util.Set<String> getEventTypeIds() {
			return eventTypeIds;
		}

		/**
		  * Restrict markets by event type associated with the market. (i.e., Football, Hockey, etc)
		  */
		public void setEventTypeIds(java.util.Set<String> eventTypeIds) {
			this.eventTypeIds = eventTypeIds;
		}		

		/**
		  * Restrict markets by the event id associated with the market.
		  */
		public java.util.Set<String> getEventIds() {
			return eventIds;
		}

		/**
		  * Restrict markets by the event id associated with the market.
		  */
		public void setEventIds(java.util.Set<String> eventIds) {
			this.eventIds = eventIds;
		}		

		/**
		  * Restrict markets by the competitions associated with the market.
		  */
		public java.util.Set<String> getCompetitionIds() {
			return competitionIds;
		}

		/**
		  * Restrict markets by the competitions associated with the market.
		  */
		public void setCompetitionIds(java.util.Set<String> competitionIds) {
			this.competitionIds = competitionIds;
		}		

		/**
		  * Restrict markets by the market id associated with the market.
		  */
		public java.util.Set<String> getMarketIds() {
			return marketIds;
		}

		/**
		  * Restrict markets by the market id associated with the market.
		  */
		public void setMarketIds(java.util.Set<String> marketIds) {
			this.marketIds = marketIds;
		}		

		/**
		  * Restrict markets by the venue associated with the market. Currently only Horse Racing markets have venues.
		  */
		public java.util.Set<String> getVenues() {
			return venues;
		}

		/**
		  * Restrict markets by the venue associated with the market. Currently only Horse Racing markets have venues.
		  */
		public void setVenues(java.util.Set<String> venues) {
			this.venues = venues;
		}		

		/**
		  * Restrict to bsp markets only, if True or non-bsp markets if False. If not specified then returns both BSP and non-BSP markets
		  */
		public boolean isBspOnly() {
			return bspOnly;
		}

		/**
		  * Restrict to bsp markets only, if True or non-bsp markets if False. If not specified then returns both BSP and non-BSP markets
		  */
		public void setBspOnly(boolean bspOnly) {
			this.bspOnly = bspOnly;
		}		

		/**
		  * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
		  */
		public boolean isTurnInPlayEnabled() {
			return turnInPlayEnabled;
		}

		/**
		  * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
		  */
		public void setTurnInPlayEnabled(boolean turnInPlayEnabled) {
			this.turnInPlayEnabled = turnInPlayEnabled;
		}		

		/**
		  * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
		  */
		public boolean isInPlayOnly() {
			return inPlayOnly;
		}

		/**
		  * Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
		  */
		public void setInPlayOnly(boolean inPlayOnly) {
			this.inPlayOnly = inPlayOnly;
		}		

		/**
		  * Restrict to markets that match the betting type of the market (i.e. Odds, Asian Handicap Singles, or Asian Handicap Doubles
		  */
		public java.util.Set<MarketBettingType> getMarketBettingTypes() {
			return marketBettingTypes;
		}

		/**
		  * Restrict to markets that match the betting type of the market (i.e. Odds, Asian Handicap Singles, or Asian Handicap Doubles
		  */
		public void setMarketBettingTypes(java.util.Set<MarketBettingType> marketBettingTypes) {
			this.marketBettingTypes = marketBettingTypes;
		}		

		/**
		  * Restrict to markets that are in the specified country or countries
		  */
		public java.util.Set<String> getMarketCountries() {
			return marketCountries;
		}

		/**
		  * Restrict to markets that are in the specified country or countries
		  */
		public void setMarketCountries(java.util.Set<String> marketCountries) {
			this.marketCountries = marketCountries;
		}		

		/**
		  * Restrict to markets that match the type of the market (i.e., MATCH_ODDS, HALF_TIME_SCORE). You should use this instead of relying on the market name as the market type codes are the same in all locales
		  */
		public java.util.Set<String> getMarketTypeCodes() {
			return marketTypeCodes;
		}

		/**
		  * Restrict to markets that match the type of the market (i.e., MATCH_ODDS, HALF_TIME_SCORE). You should use this instead of relying on the market name as the market type codes are the same in all locales
		  */
		public void setMarketTypeCodes(java.util.Set<String> marketTypeCodes) {
			this.marketTypeCodes = marketTypeCodes;
		}		

		/**
		  * Restrict to markets with a market start time before or after the specified date
		  */
		public TimeRange getMarketStartTime() {
			return marketStartTime;
		}

		/**
		  * Restrict to markets with a market start time before or after the specified date
		  */
		public void setMarketStartTime(TimeRange marketStartTime) {
			this.marketStartTime = marketStartTime;
		}		

		/**
		  * Restrict to markets that I have one or more orders in these status.
		  */
		public java.util.Set<OrderStatus> getWithOrders() {
			return withOrders;
		}

		/**
		  * Restrict to markets that I have one or more orders in these status.
		  */
		public void setWithOrders(java.util.Set<OrderStatus> withOrders) {
			this.withOrders = withOrders;
		}		

   	
   	}
  