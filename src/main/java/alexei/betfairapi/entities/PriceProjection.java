	
package alexei.betfairapi.entities;


	/**
	  * Selection criteria of the returning price data . This class was auto-generated from interface definition xml.
	  */
public class PriceProjection {
	
	/**
	  * The basic price data you want to receive in the response.
	  */
	private java.util.Set<PriceData> priceData;

	/**
	  * Options to alter the default representation of best offer prices Applicable to EX_BEST_OFFERS priceData selection
	  */
	private ExBestOffersOverrides exBestOffersOverrides;

	/**
	  * Indicates if the returned prices should include virtual prices. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS priceData selections, default value is false.
	  */
	private boolean virtualise;

	/**
	  * Indicates if the volume returned at each price point should be the absolute value or a cumulative sum of volumes available at the price and all better prices. If unspecified defaults to false. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS price projections. Not supported as yet.
	  */
	private boolean rolloverStakes;

	/**
	  * The basic price data you want to receive in the response.
	  */
	public java.util.Set<PriceData> getPriceData() {
		return priceData;
	}

	/**
	  * The basic price data you want to receive in the response.
	  */
	public void setPriceData(java.util.Set<PriceData> priceData) {
		this.priceData = priceData;
	}

	/**
	  * Options to alter the default representation of best offer prices Applicable to EX_BEST_OFFERS priceData selection
	  */
	public ExBestOffersOverrides getExBestOffersOverrides() {
		return exBestOffersOverrides;
	}

	/**
	  * Options to alter the default representation of best offer prices Applicable to EX_BEST_OFFERS priceData selection
	  */
	public void setExBestOffersOverrides(ExBestOffersOverrides exBestOffersOverrides) {
		this.exBestOffersOverrides = exBestOffersOverrides;
	}

	/**
	  * Indicates if the returned prices should include virtual prices. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS priceData selections, default value is false.
	  */
	public boolean isVirtualise() {
		return virtualise;
	}

	/**
	  * Indicates if the returned prices should include virtual prices. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS priceData selections, default value is false.
	  */
	public void setVirtualise(boolean virtualise) {
		this.virtualise = virtualise;
	}

	/**
	  * Indicates if the volume returned at each price point should be the absolute value or a cumulative sum of volumes available at the price and all better prices. If unspecified defaults to false. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS price projections. Not supported as yet.
	  */
	public boolean isRolloverStakes() {
		return rolloverStakes;
	}

	/**
	  * Indicates if the volume returned at each price point should be the absolute value or a cumulative sum of volumes available at the price and all better prices. If unspecified defaults to false. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS price projections. Not supported as yet.
	  */
	public void setRolloverStakes(boolean rolloverStakes) {
		this.rolloverStakes = rolloverStakes;
	}

}
