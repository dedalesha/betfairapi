
   	package alexei.betfairapi.entities;
   	
	/**
	  * Information about the Runners (selections) in a market
	  * This class was auto-generated from interface definition xml.
	  */
   	public class RunnerCatalog {
   	
   		
		/**
		  * The unique id for the selection.
		  */
		private long selectionId;

		/**
		  * The name of the runner
		  */
		private String runnerName;

		/**
		  * The handicap
		  */
		private double handicap;

		/**
		  * The sort priority of this runner
		  */
		private int sortPriority;

		/**
		  * Metadata associated with the runner
		  */
		private java.util.Map<String,String> metadata;

   		
   		
		/**
		  * The unique id for the selection.
		  */
		public long getSelectionId() {
			return selectionId;
		}

		/**
		  * The unique id for the selection.
		  */
		public void setSelectionId(long selectionId) {
			this.selectionId = selectionId;
		}		

		/**
		  * The name of the runner
		  */
		public String getRunnerName() {
			return runnerName;
		}

		/**
		  * The name of the runner
		  */
		public void setRunnerName(String runnerName) {
			this.runnerName = runnerName;
		}		

		/**
		  * The handicap
		  */
		public double getHandicap() {
			return handicap;
		}

		/**
		  * The handicap
		  */
		public void setHandicap(double handicap) {
			this.handicap = handicap;
		}		

		/**
		  * The sort priority of this runner
		  */
		public int getSortPriority() {
			return sortPriority;
		}

		/**
		  * The sort priority of this runner
		  */
		public void setSortPriority(int sortPriority) {
			this.sortPriority = sortPriority;
		}		

		/**
		  * Metadata associated with the runner
		  */
		public java.util.Map<String,String> getMetadata() {
			return metadata;
		}

		/**
		  * Metadata associated with the runner
		  */
		public void setMetadata(java.util.Map<String,String> metadata) {
			this.metadata = metadata;
		}		

   	
   	}
  