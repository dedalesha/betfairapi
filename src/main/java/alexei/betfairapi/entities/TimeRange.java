	
package alexei.betfairapi.entities;


	/**
	  * TimeRange. This class was auto-generated from interface definition xml.
	  */
public class TimeRange {
	
	/**
	  * from, format: ISO 8601)
	  */
	private java.util.Date from;

	/**
	  * to, format: ISO 8601
	  */
	private java.util.Date to;

	/**
	  * from, format: ISO 8601)
	  */
	public java.util.Date getFrom() {
		return from;
	}

	/**
	  * from, format: ISO 8601)
	  */
	public void setFrom(java.util.Date from) {
		this.from = from;
	}

	/**
	  * to, format: ISO 8601
	  */
	public java.util.Date getTo() {
		return to;
	}

	/**
	  * to, format: ISO 8601
	  */
	public void setTo(java.util.Date to) {
		this.to = to;
	}

}
