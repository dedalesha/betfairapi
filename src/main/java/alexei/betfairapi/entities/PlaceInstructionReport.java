
   	package alexei.betfairapi.entities;
   	
	/**
	  * Response to a PlaceInstruction
	  * This class was auto-generated from interface definition xml.
	  */
   	public class PlaceInstructionReport {
   	
   		
		/**
		  * whether the command succeeded or failed
		  */
		private String status;

		/**
		  * cause of failure, or null if command succeeds
		  */
		private String errorCode;

		/**
		  * The instruction that was requested
		  */
		private PlaceInstruction instruction;

		/**
		  * The bet ID of the new bet. May be null on failure.
		  */
		private String betId;

		/**
		  * 
		  */
		private java.util.Date placedDate;

		/**
		  * 
		  */
		private double averagePriceMatched;

		/**
		  * 
		  */
		private double sizeMatched;

   		
   		
		/**
		  * whether the command succeeded or failed
		  */
		public String getStatus() {
			return status;
		}

		/**
		  * whether the command succeeded or failed
		  */
		public void setStatus(String status) {
			this.status = status;
		}		

		/**
		  * cause of failure, or null if command succeeds
		  */
		public String getErrorCode() {
			return errorCode;
		}

		/**
		  * cause of failure, or null if command succeeds
		  */
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}		

		/**
		  * The instruction that was requested
		  */
		public PlaceInstruction getInstruction() {
			return instruction;
		}

		/**
		  * The instruction that was requested
		  */
		public void setInstruction(PlaceInstruction instruction) {
			this.instruction = instruction;
		}		

		/**
		  * The bet ID of the new bet. May be null on failure.
		  */
		public String getBetId() {
			return betId;
		}

		/**
		  * The bet ID of the new bet. May be null on failure.
		  */
		public void setBetId(String betId) {
			this.betId = betId;
		}		

		/**
		  * 
		  */
		public java.util.Date getPlacedDate() {
			return placedDate;
		}

		/**
		  * 
		  */
		public void setPlacedDate(java.util.Date placedDate) {
			this.placedDate = placedDate;
		}		

		/**
		  * 
		  */
		public double getAveragePriceMatched() {
			return averagePriceMatched;
		}

		/**
		  * 
		  */
		public void setAveragePriceMatched(double averagePriceMatched) {
			this.averagePriceMatched = averagePriceMatched;
		}		

		/**
		  * 
		  */
		public double getSizeMatched() {
			return sizeMatched;
		}

		/**
		  * 
		  */
		public void setSizeMatched(double sizeMatched) {
			this.sizeMatched = sizeMatched;
		}		

   	
   	}
  