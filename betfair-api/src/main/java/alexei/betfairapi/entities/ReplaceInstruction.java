	
package alexei.betfairapi.entities;


	/**
	  * Instruction to replace a LIMIT or LIMIT_ON_CLOSE order at a new price. Original order will be cancelled and a new order placed at the new price for the remaining stake. . This class was auto-generated from interface definition xml.
	  */
public class ReplaceInstruction {
	
	/**
	  * 
	  */
	private String betId;

	/**
	  * The price to replace the bet at
	  */
	private double newPrice;

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
	  * The price to replace the bet at
	  */
	public double getNewPrice() {
		return newPrice;
	}

	/**
	  * The price to replace the bet at
	  */
	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

}
