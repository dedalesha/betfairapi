	
package alexei.betfairapi.entities;


	/**
	  * Profit and loss if selection is wins or loses. This class was auto-generated from interface definition xml.
	  */
public class RunnerProfitAndLoss {
	
	/**
	  * The unique identifier for the selection
	  */
	private long selectionId;

	/**
	  * Profit and loss for the market if this selection is the winner
	  */
	private double ifWin;

	/**
	  * Profit and loss for the market if this selection is the loser. Only returned for multi-winner odds markets.
	  */
	private double ifLose;

	/**
	  * Profit and loss for the market if this selection is placed. Only returned for EACH_WAY markets.
	  */
	private double ifPlace;

	/**
	  * The unique identifier for the selection
	  */
	public long getSelectionId() {
		return selectionId;
	}

	/**
	  * The unique identifier for the selection
	  */
	public void setSelectionId(long selectionId) {
		this.selectionId = selectionId;
	}

	/**
	  * Profit and loss for the market if this selection is the winner
	  */
	public double getIfWin() {
		return ifWin;
	}

	/**
	  * Profit and loss for the market if this selection is the winner
	  */
	public void setIfWin(double ifWin) {
		this.ifWin = ifWin;
	}

	/**
	  * Profit and loss for the market if this selection is the loser. Only returned for multi-winner odds markets.
	  */
	public double getIfLose() {
		return ifLose;
	}

	/**
	  * Profit and loss for the market if this selection is the loser. Only returned for multi-winner odds markets.
	  */
	public void setIfLose(double ifLose) {
		this.ifLose = ifLose;
	}

	/**
	  * Profit and loss for the market if this selection is placed. Only returned for EACH_WAY markets.
	  */
	public double getIfPlace() {
		return ifPlace;
	}

	/**
	  * Profit and loss for the market if this selection is placed. Only returned for EACH_WAY markets.
	  */
	public void setIfPlace(double ifPlace) {
		this.ifPlace = ifPlace;
	}

}
