	
package alexei.betfairapi.entities;


	/**
	  * MarketType Result. This class was auto-generated from interface definition xml.
	  */
public class MarketTypeResult {
	
	/**
	  * Market Type
	  */
	private String marketType;

	/**
	  * Count of markets associated with this marketType
	  */
	private Integer marketCount;

	/**
	  * Market Type
	  */
	public String getMarketType() {
		return marketType;
	}

	/**
	  * Market Type
	  */
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	/**
	  * Count of markets associated with this marketType
	  */
	public Integer getMarketCount() {
		return marketCount;
	}

	/**
	  * Count of markets associated with this marketType
	  */
	public void setMarketCount(Integer marketCount) {
		this.marketCount = marketCount;
	}

}
