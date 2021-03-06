	
package alexei.betfairapi.entities;


	/**
	  * Market definition. This class was auto-generated from interface definition xml.
	  */
public class MarketDescription {
	
	/**
	  * persistenceMarket
	  */
	private Boolean persistenceEnabled;

	/**
	  * bspMarket
	  */
	private Boolean bspMarket;

	/**
	  * marketTime
	  */
	private java.util.Date marketTime;

	/**
	  * marketSuspendTime
	  */
	private java.util.Date suspendTime;

	/**
	  * settled time
	  */
	private java.util.Date settleTime;

	/**
	  * bettingType
	  */
	private String bettingType;

	/**
	  * canTurnInPlay
	  */
	private Boolean turnInPlayEnabled;

	/**
	  * market base type
	  */
	private String marketType;

	/**
	  * the market regulator
	  */
	private String regulator;

	/**
	  * 
	  */
	private double marketBaseRate;

	/**
	  * 
	  */
	private Boolean discountAllowed;

	/**
	  * 
	  */
	private String wallet;

	/**
	  * 
	  */
	private String rules;

	/**
	  * 
	  */
	private Boolean rulesHasDate;

	/**
	  * 
	  */
	private String clarifications;

	/**
	  * Each Way Divisor for E/W markets
	  */
	private double eachWayDivisor;

	/**
	  * persistenceMarket
	  */
	public Boolean isPersistenceEnabled() {
		return persistenceEnabled;
	}

	/**
	  * persistenceMarket
	  */
	public void setPersistenceEnabled(Boolean persistenceEnabled) {
		this.persistenceEnabled = persistenceEnabled;
	}

	/**
	  * bspMarket
	  */
	public Boolean isBspMarket() {
		return bspMarket;
	}

	/**
	  * bspMarket
	  */
	public void setBspMarket(Boolean bspMarket) {
		this.bspMarket = bspMarket;
	}

	/**
	  * marketTime
	  */
	public java.util.Date getMarketTime() {
		return marketTime;
	}

	/**
	  * marketTime
	  */
	public void setMarketTime(java.util.Date marketTime) {
		this.marketTime = marketTime;
	}

	/**
	  * marketSuspendTime
	  */
	public java.util.Date getSuspendTime() {
		return suspendTime;
	}

	/**
	  * marketSuspendTime
	  */
	public void setSuspendTime(java.util.Date suspendTime) {
		this.suspendTime = suspendTime;
	}

	/**
	  * settled time
	  */
	public java.util.Date getSettleTime() {
		return settleTime;
	}

	/**
	  * settled time
	  */
	public void setSettleTime(java.util.Date settleTime) {
		this.settleTime = settleTime;
	}

	/**
	  * bettingType
	  */
	public String getBettingType() {
		return bettingType;
	}

	/**
	  * bettingType
	  */
	public void setBettingType(String bettingType) {
		this.bettingType = bettingType;
	}

	/**
	  * canTurnInPlay
	  */
	public Boolean isTurnInPlayEnabled() {
		return turnInPlayEnabled;
	}

	/**
	  * canTurnInPlay
	  */
	public void setTurnInPlayEnabled(Boolean turnInPlayEnabled) {
		this.turnInPlayEnabled = turnInPlayEnabled;
	}

	/**
	  * market base type
	  */
	public String getMarketType() {
		return marketType;
	}

	/**
	  * market base type
	  */
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	/**
	  * the market regulator
	  */
	public String getRegulator() {
		return regulator;
	}

	/**
	  * the market regulator
	  */
	public void setRegulator(String regulator) {
		this.regulator = regulator;
	}

	/**
	  * 
	  */
	public double getMarketBaseRate() {
		return marketBaseRate;
	}

	/**
	  * 
	  */
	public void setMarketBaseRate(double marketBaseRate) {
		this.marketBaseRate = marketBaseRate;
	}

	/**
	  * 
	  */
	public Boolean isDiscountAllowed() {
		return discountAllowed;
	}

	/**
	  * 
	  */
	public void setDiscountAllowed(Boolean discountAllowed) {
		this.discountAllowed = discountAllowed;
	}

	/**
	  * 
	  */
	public String getWallet() {
		return wallet;
	}

	/**
	  * 
	  */
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

	/**
	  * 
	  */
	public String getRules() {
		return rules;
	}

	/**
	  * 
	  */
	public void setRules(String rules) {
		this.rules = rules;
	}

	/**
	  * 
	  */
	public Boolean isRulesHasDate() {
		return rulesHasDate;
	}

	/**
	  * 
	  */
	public void setRulesHasDate(Boolean rulesHasDate) {
		this.rulesHasDate = rulesHasDate;
	}

	/**
	  * 
	  */
	public String getClarifications() {
		return clarifications;
	}

	/**
	  * 
	  */
	public void setClarifications(String clarifications) {
		this.clarifications = clarifications;
	}

	/**
	  * Each Way Divisor for E/W markets
	  */
	public double getEachWayDivisor() {
		return eachWayDivisor;
	}

	/**
	  * Each Way Divisor for E/W markets
	  */
	public void setEachWayDivisor(double eachWayDivisor) {
		this.eachWayDivisor = eachWayDivisor;
	}

}
