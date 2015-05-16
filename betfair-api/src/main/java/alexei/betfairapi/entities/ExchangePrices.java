	
package alexei.betfairapi.entities;


	/**
	  * . This class was auto-generated from interface definition xml.
	  */
public class ExchangePrices {
	
	/**
	  * 
	  */
	private java.util.List<PriceSize> availableToBack;

	/**
	  * 
	  */
	private java.util.List<PriceSize> availableToLay;

	/**
	  * 
	  */
	private java.util.List<PriceSize> tradedVolume;

	/**
	  * 
	  */
	public java.util.List<PriceSize> getAvailableToBack() {
		return availableToBack;
	}

	/**
	  * 
	  */
	public void setAvailableToBack(java.util.List<PriceSize> availableToBack) {
		this.availableToBack = availableToBack;
	}

	/**
	  * 
	  */
	public java.util.List<PriceSize> getAvailableToLay() {
		return availableToLay;
	}

	/**
	  * 
	  */
	public void setAvailableToLay(java.util.List<PriceSize> availableToLay) {
		this.availableToLay = availableToLay;
	}

	/**
	  * 
	  */
	public java.util.List<PriceSize> getTradedVolume() {
		return tradedVolume;
	}

	/**
	  * 
	  */
	public void setTradedVolume(java.util.List<PriceSize> tradedVolume) {
		this.tradedVolume = tradedVolume;
	}

}
