	
package alexei.betfairapi.entities;


	/**
	  * . This class was auto-generated from interface definition xml.
	  */
public class UpdateInstructionReport {
	
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
	private UpdateInstruction instruction;

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
	public UpdateInstruction getInstruction() {
		return instruction;
	}

	/**
	  * The instruction that was requested
	  */
	public void setInstruction(UpdateInstruction instruction) {
		this.instruction = instruction;
	}

}
