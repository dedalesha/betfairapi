	
package alexei.betfairapi.entities;


	/**
	  * Instruction to place a new order. This class was auto-generated from interface definition xml.
	  */
public class PlaceInstruction {
	
	/**
	  * 
	  */
	private OrderType orderType;

	/**
	  * The selection_id.
	  */
	private Long selectionId;

	/**
	  * The handicap applied to the selection, if on an asian-style market.
	  */
	private double handicap;

	/**
	  * Back or Lay
	  */
	private Side side;

	/**
	  * 
	  */
	private LimitOrder limitOrder;

	/**
	  * 
	  */
	private LimitOnCloseOrder limitOnCloseOrder;

	/**
	  * 
	  */
	private MarketOnCloseOrder marketOnCloseOrder;

	/**
	  * 
	  */
	public OrderType getOrderType() {
		return orderType;
	}

	/**
	  * 
	  */
	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	/**
	  * The selection_id.
	  */
	public Long getSelectionId() {
		return selectionId;
	}

	/**
	  * The selection_id.
	  */
	public void setSelectionId(Long selectionId) {
		this.selectionId = selectionId;
	}

	/**
	  * The handicap applied to the selection, if on an asian-style market.
	  */
	public double getHandicap() {
		return handicap;
	}

	/**
	  * The handicap applied to the selection, if on an asian-style market.
	  */
	public void setHandicap(double handicap) {
		this.handicap = handicap;
	}

	/**
	  * Back or Lay
	  */
	public Side getSide() {
		return side;
	}

	/**
	  * Back or Lay
	  */
	public void setSide(Side side) {
		this.side = side;
	}

	/**
	  * 
	  */
	public LimitOrder getLimitOrder() {
		return limitOrder;
	}

	/**
	  * 
	  */
	public void setLimitOrder(LimitOrder limitOrder) {
		this.limitOrder = limitOrder;
	}

	/**
	  * 
	  */
	public LimitOnCloseOrder getLimitOnCloseOrder() {
		return limitOnCloseOrder;
	}

	/**
	  * 
	  */
	public void setLimitOnCloseOrder(LimitOnCloseOrder limitOnCloseOrder) {
		this.limitOnCloseOrder = limitOnCloseOrder;
	}

	/**
	  * 
	  */
	public MarketOnCloseOrder getMarketOnCloseOrder() {
		return marketOnCloseOrder;
	}

	/**
	  * 
	  */
	public void setMarketOnCloseOrder(MarketOnCloseOrder marketOnCloseOrder) {
		this.marketOnCloseOrder = marketOnCloseOrder;
	}

}
