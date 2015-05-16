	
package alexei.betfairapi.entities;


	/**
	  * . This class was auto-generated from interface definition xml.
	  */
public class Order {
	
	/**
	  * 
	  */
	private String betId;

	/**
	  * BSP Order type.
	  */
	private String orderType;

	/**
	  * Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
	  */
	private String status;

	/**
	  * What to do with the order at turn-in-play
	  */
	private String persistenceType;

	/**
	  * 
	  */
	private String side;

	/**
	  * The price of the bet.
	  */
	private double price;

	/**
	  * The size of the bet.
	  */
	private double size;

	/**
	  * Not to be confused with size. This is the liability of a given BSP bet.
	  */
	private double bspLiability;

	/**
	  * The date, to the second, the bet was placed.
	  */
	private java.util.Date placedDate;

	/**
	  * The average price matched at. Voided match fragments are removed from this average calculation.
	  */
	private double avgPriceMatched;

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
	  * What to do with the order at turn-in-play
	  */
	public String getPersistenceType() {
		return persistenceType;
	}

	/**
	  * What to do with the order at turn-in-play
	  */
	public void setPersistenceType(String persistenceType) {
		this.persistenceType = persistenceType;
	}

	/**
	  * 
	  */
	public String getSide() {
		return side;
	}

	/**
	  * 
	  */
	public void setSide(String side) {
		this.side = side;
	}

	/**
	  * The price of the bet.
	  */
	public double getPrice() {
		return price;
	}

	/**
	  * The price of the bet.
	  */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	  * The size of the bet.
	  */
	public double getSize() {
		return size;
	}

	/**
	  * The size of the bet.
	  */
	public void setSize(double size) {
		this.size = size;
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
	  * The average price matched at. Voided match fragments are removed from this average calculation.
	  */
	public double getAvgPriceMatched() {
		return avgPriceMatched;
	}

	/**
	  * The average price matched at. Voided match fragments are removed from this average calculation.
	  */
	public void setAvgPriceMatched(double avgPriceMatched) {
		this.avgPriceMatched = avgPriceMatched;
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

}
