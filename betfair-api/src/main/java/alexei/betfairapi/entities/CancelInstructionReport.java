	
package alexei.betfairapi.entities;


	/**
	  * . This class was auto-generated from interface definition xml.
	  */
public class CancelInstructionReport {
	
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
	private CancelInstruction instruction;

	/**
	  * 
	  */
	private double sizeCancelled;

	/**
	  * 
	  */
	private java.util.Date cancelledDate;

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
	public CancelInstruction getInstruction() {
		return instruction;
	}

	/**
	  * The instruction that was requested
	  */
	public void setInstruction(CancelInstruction instruction) {
		this.instruction = instruction;
	}

	/**
	  * 
	  */
	public double getSizeCancelled() {
		return sizeCancelled;
	}

	/**
	  * 
	  */
	public void setSizeCancelled(double sizeCancelled) {
		this.sizeCancelled = sizeCancelled;
	}

	/**
	  * 
	  */
	public java.util.Date getCancelledDate() {
		return cancelledDate;
	}

	/**
	  * 
	  */
	public void setCancelledDate(java.util.Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

}
