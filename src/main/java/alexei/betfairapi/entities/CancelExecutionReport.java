
   	package alexei.betfairapi.entities;
   	
	/**
	  * 
	  */
   	public class CancelExecutionReport {
   	
   		
		/**
		  * Echo of the customerRef if passed.
		  */
		private String customerRef;

		/**
		  * 
		  */
		private String status;

		/**
		  * 
		  */
		private String errorCode;

		/**
		  * Echo of marketId passed
		  */
		private String marketId;

		/**
		  * 
		  */
		private java.util.List<CancelInstructionReport> instructionReports;

   	
   	}
  