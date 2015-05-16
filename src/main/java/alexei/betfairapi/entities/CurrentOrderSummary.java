	
package alexei.betfairapi.entities;


	/**
	  * Summary of a current order.. This class was auto-generated from interface definition xml.
	  */
public class CurrentOrderSummary {
	
	/**
	  * The bet ID of the original place order.
	  */
	private String betId;

	/**
	  * The market id the order is for.
	  */
	private String marketId;

	/**
	  * The selection id the order is for.
	  */
	private Long selectionId;

	/**
	  * The handicap of the bet.
	  */
	private double handicap;

	/**
	  * The price and size of the bet.
	  */
	private PriceSize priceSize;

	/**
	  * Not to be confused with size. This is the liability of a given BSP bet.
	  */
	private double bspLiability;

	/**
	  * BACK/LAY
	  */
	private String side;

	/**
	  * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
	  */
	private String status;

	/**
	  * What to do with the order at turn-in-play.
	  */
	private String persistenceType;

	/**
	  * BSP Order type.
	  */
	private String orderType;

	/**
	  * The date, to the second, the bet was placed.
	  */
	private java.util.Date placedDate;

	/**
	  * The date, to the second, of the last matched bet fragment (where applicable).
	  */
	private java.util.Date matchedDate;

	/**
	  * The average price matched at. Voided match fragments are removed from this average calculation.
	  */
	private double averagePriceMatched;

	/**
	  * The current amount of this bet that was matched.
	  */
	private double sizeMatched;

	/**
	  * The current amount of this bet that is unmatched.
	  */
	private double sizeRemaining;

	/**
	  * The current amount of this bet that was lapsed.
	  */
	private double sizeLapsed;

	/**
	  * The current amount of this bet that was cancelled.
	  */
	private double sizeCancelled;

	/**
	  * The current amount of this bet that was voided.
	  */
	private double sizeVoided;

	/**
	  * The regulator authorisation code.
	  */
	private String regulatorAuthCode;

	/**
	  * The regulator Code.
	  */
	private String regulatorCode;

	/**
	  * The bet ID of the original place order.
	  */
	public String getBetId() {
		return betId;
	}

	/**
	  * The bet ID of the original place order.
	  */
	public void setBetId(String betId) {
		this.betId = betId;
	}

	/**
	  * The market id the order is for.
	  */
	public String getMarketId() {
		return marketId;
	}

	/**
	  * The market id the order is for.
	  */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	/**
	  * The selection id the order is for.
	  */
	public Long getSelectionId() {
		return selectionId;
	}

	/**
	  * The selection id the order is for.
	  */
	public void setSelectionId(Long selectionId) {
		this.selectionId = selectionId;
	}

	/**
	  * The handicap of the bet.
	  */
	public double getHandicap() {
		return handicap;
	}

	/**
	  * The handicap of the bet.
	  */
	public void setHandicap(double handicap) {
		this.handicap = handicap;
	}

	/**
	  * The price and size of the bet.
	  */
	public PriceSize getPriceSize() {
		return priceSize;
	}

	/**
	  * The price and size of the bet.
	  */
	public void setPriceSize(PriceSize priceSize) {
		this.priceSize = priceSize;
	}

	/**
	  * Not to be confused with size. This is the liability of a given BSP bet.
	  */
	public double getBspLiability() {
		return bspLiability;
	}

	/**
	  * Not to be confused with size. This is the liability of a given BSP bet.
	  */
	public void setBspLiability(double bspLiability) {
		this.bspLiability = bspLiability;
	}

	/**
	  * BACK/LAY
	  */
	public String getSide() {
		return side;
	}

	/**
	  * BACK/LAY
	  */
	public void setSide(String side) {
		this.side = side;
	}

	/**
	  * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
	  */
	public String getStatus() {
		return status;
	}

	/**
	  * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
	  */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	  * What to do with the order at turn-in-play.
	  */
	public String getPersistenceType() {
		return persistenceType;
	}

	/**
	  * What to do with the order at turn-in-play.
	  */
	public void setPersistenceType(String persistenceType) {
		this.persistenceType = persistenceType;
	}

	/**
	  * BSP Order type.
	  */
	public String getOrderType() {
		return orderType;
	}

	/**
	  * BSP Order type.
	  */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	  * The date, to the second, the bet was placed.
	  */
	public java.util.Date getPlacedDate() {
		return placedDate;
	}

	/**
	  * The date, to the second, the bet was placed.
	  */
	public void setPlacedDate(java.util.Date placedDate) {
		this.placedDate = placedDate;
	}

	/**
	  * The date, to the second, of the last matched bet fragment (where applicable).
	  */
	public java.util.Date getMatchedDate() {
		return matchedDate;
	}

	/**
	  * The date, to the second, of the last matched bet fragment (where applicable).
	  */
	public void setMatchedDate(java.util.Date matchedDate) {
		this.matchedDate = matchedDate;
	}

	/**
	  * The average price matched at. Voided match fragments are removed from this average calculation.
	  */
	public double getAveragePriceMatched() {
		return averagePriceMatched;
	}

	/**
	  * The average price matched at. Voided match fragments are removed from this average calculation.
	  */
	public void setAveragePriceMatched(double averagePriceMatched) {
		this.averagePriceMatched = averagePriceMatched;
	}

	/**
	  * The current amount of this bet that was matched.
	  */
	public double getSizeMatched() {
		return sizeMatched;
	}

	/**
	  * The current amount of this bet that was matched.
	  */
	public void setSizeMatched(double sizeMatched) {
		this.sizeMatched = sizeMatched;
	}

	/**
	  * The current amount of this bet that is unmatched.
	  */
	public double getSizeRemaining() {
		return sizeRemaining;
	}

	/**
	  * The current amount of this bet that is unmatched.
	  */
	public void setSizeRemaining(double sizeRemaining) {
		this.sizeRemaining = sizeRemaining;
	}

	/**
	  * The current amount of this bet that was lapsed.
	  */
	public double getSizeLapsed() {
		return sizeLapsed;
	}

	/**
	  * The current amount of this bet that was lapsed.
	  */
	public void setSizeLapsed(double sizeLapsed) {
		this.sizeLapsed = sizeLapsed;
	}

	/**
	  * The current amount of this bet that was cancelled.
	  */
	public double getSizeCancelled() {
		return sizeCancelled;
	}

	/**
	  * The current amount of this bet that was cancelled.
	  */
	public void setSizeCancelled(double sizeCancelled) {
		this.sizeCancelled = sizeCancelled;
	}

	/**
	  * The current amount of this bet that was voided.
	  */
	public double getSizeVoided() {
		return sizeVoided;
	}

	/**
	  * The current amount of this bet that was voided.
	  */
	public void setSizeVoided(double sizeVoided) {
		this.sizeVoided = sizeVoided;
	}

	/**
	  * The regulator authorisation code.
	  */
	public String getRegulatorAuthCode() {
		return regulatorAuthCode;
	}

	/**
	  * The regulator authorisation code.
	  */
	public void setRegulatorAuthCode(String regulatorAuthCode) {
		this.regulatorAuthCode = regulatorAuthCode;
	}

	/**
	  * The regulator Code.
	  */
	public String getRegulatorCode() {
		return regulatorCode;
	}

	/**
	  * The regulator Code.
	  */
	public void setRegulatorCode(String regulatorCode) {
		this.regulatorCode = regulatorCode;
	}

}
