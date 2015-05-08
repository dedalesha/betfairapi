	
package alexei.betfairapi.entities;


	/**
	  * . This class was auto-generated from interface definition xml.
	  */
public class PlaceExecutionReport {
	
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
	private java.util.List<PlaceInstructionReport> instructionReports;

	/**
	  * Echo of the customerRef if passed.
	  */
	public String getCustomerRef() {
		return customerRef;
	}

	/**
	  * Echo of the customerRef if passed.
	  */
	public void setCustomerRef(String customerRef) {
		this.customerRef = customerRef;
	}

	/**
	  * 
	  */
	public String getStatus() {
		return status;
	}

	/**
	  * 
	  */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	  * 
	  */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	  * 
	  */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	  * Echo of marketId passed
	  */
	public String getMarketId() {
		return marketId;
	}

	/**
	  * Echo of marketId passed
	  */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	/**
	  * 
	  */
	public java.util.List<PlaceInstructionReport> getInstructionReports() {
		return instructionReports;
	}

	/**
	  * 
	  */
	public void setInstructionReports(java.util.List<PlaceInstructionReport> instructionReports) {
		this.instructionReports = instructionReports;
	}

}
