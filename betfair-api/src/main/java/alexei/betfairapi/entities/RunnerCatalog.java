	
package alexei.betfairapi.entities;


	/**
	  * Information about the Runners (selections) in a market. This class was auto-generated from interface definition xml.
	  */
public class RunnerCatalog {
	
	/**
	  * The unique id for the selection.
	  */
	private Long selectionId;

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
	private Integer sortPriority;

	/**
	  * Metadata associated with the runner
	  */
	private java.util.Map<String,String> metadata;

	/**
	  * The unique id for the selection.
	  */
	public Long getSelectionId() {
		return selectionId;
	}

	/**
	  * The unique id for the selection.
	  */
	public void setSelectionId(Long selectionId) {
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
	public Integer getSortPriority() {
		return sortPriority;
	}

	/**
	  * The sort priority of this runner
	  */
	public void setSortPriority(Integer sortPriority) {
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
