package alexei.betfairapi;

import javax.ws.rs.core.Response.StatusType;

public class RestException extends RuntimeException {

	private StatusType statusType;

	public StatusType getStatusType() {
		return statusType;
	}

	public RestException(StatusType statusType) {
		this.statusType = statusType;
	}
	
	@Override
	public String getMessage() {
		return String.format("RESTful request failed %d %s %s", statusType.getStatusCode(), statusType.getFamily(), statusType.getReasonPhrase());
	}
	
}
