	
package alexei.betfairapi.entities;


	/**
	  * Instruction to fully or partially cancel an order (only applies to LIMIT orders). This class was auto-generated from interface definition xml.
	  */
public class CancelInstruction {
	
	/**
	  * 
	  */
	private String betId;

	/**
	  * If supplied then this is a partial cancel
	  */
	private double sizeReduction;

	/**
	  * 
	  */
	public String getBetId() {
		return betId;
	}

	/**
	  * 
	  */
	public void setBetId(String betId) {
		this.betId = betId;
	}

	/**
	  * If supplied then this is a partial cancel
	  */
	public double getSizeReduction() {
		return sizeReduction;
	}

	/**
	  * If supplied then this is a partial cancel
	  */
	public void setSizeReduction(double sizeReduction) {
		this.sizeReduction = sizeReduction;
	}

}
