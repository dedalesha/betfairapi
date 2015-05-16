	
package alexei.betfairapi.entities;


	/**
	  * . This class was auto-generated from interface definition xml.
	  */
public class ReplaceInstructionReport {
	
	/**
	  * whether the command succeeded or failed
	  */
	private String status;

	/**
	  * cause of failure, or null if command succeeds
	  */
	private String errorCode;

	/**
	  * Cancelation report for the original order
	  */
	private CancelInstructionReport cancelInstructionReport;

	/**
	  * Placement report for the new order
	  */
	private PlaceInstructionReport placeInstructionReport;

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
	  * Cancelation report for the original order
	  */
	public CancelInstructionReport getCancelInstructionReport() {
		return cancelInstructionReport;
	}

	/**
	  * Cancelation report for the original order
	  */
	public void setCancelInstructionReport(CancelInstructionReport cancelInstructionReport) {
		this.cancelInstructionReport = cancelInstructionReport;
	}

	/**
	  * Placement report for the new order
	  */
	public PlaceInstructionReport getPlaceInstructionReport() {
		return placeInstructionReport;
	}

	/**
	  * Placement report for the new order
	  */
	public void setPlaceInstructionReport(PlaceInstructionReport placeInstructionReport) {
		this.placeInstructionReport = placeInstructionReport;
	}

}
