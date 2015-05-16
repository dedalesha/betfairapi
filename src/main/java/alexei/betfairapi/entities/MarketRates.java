	
package alexei.betfairapi.entities;


	/**
	  * Market Rates. This class was auto-generated from interface definition xml.
	  */
public class MarketRates {
	
	/**
	  * marketBaseRate
	  */
	private double marketBaseRate;

	/**
	  * discountAllowed
	  */
	private Boolean discountAllowed;

	/**
	  * marketBaseRate
	  */
	public double getMarketBaseRate() {
		return marketBaseRate;
	}

	/**
	  * marketBaseRate
	  */
	public void setMarketBaseRate(double marketBaseRate) {
		this.marketBaseRate = marketBaseRate;
	}

	/**
	  * discountAllowed
	  */
	public Boolean isDiscountAllowed() {
		return discountAllowed;
	}

	/**
	  * discountAllowed
	  */
	public void setDiscountAllowed(Boolean discountAllowed) {
		this.discountAllowed = discountAllowed;
	}

}
