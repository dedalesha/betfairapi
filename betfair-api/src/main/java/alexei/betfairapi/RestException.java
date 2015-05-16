package alexei.betfairapi;

import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

public class RestException extends RuntimeException {

	private static final long serialVersionUID = 388888092265215953L;
	private Response response;
	private APINGClientErrorResponse apingErrorResponse;
	private String resource;

	public RestException(String resource, Response response) {
		this.resource = resource;
		this.response = response;
	}
	
	public RestException(String resource, Response response,
			APINGClientErrorResponse apingErrorResponse) {
		this.resource = resource;
		this.response = response;
		this.apingErrorResponse = apingErrorResponse;
	}

	@Override
	public String getMessage() {
		String errorDetail = "";
		if (apingErrorResponse!=null) {
			errorDetail = String.format("faultString: %s description: %s", apingErrorResponse.getFaultstring(), APINGClientErrorResponse.describeError( apingErrorResponse.getFaultstring() ));
			if (apingErrorResponse.getDetail()!=null && apingErrorResponse.getDetail().getAPINGException()!=null) {
				APINGException ex = apingErrorResponse.getDetail().getAPINGException();
				errorDetail += String.format(" errorCode: %s (%s), requestUuid: %s, errorDetails: %s", ex.getErrorCode().toString(), ex.getErrorCode().getDescription(), ex.getRequestUUID(), ex.getErrorDetails());
			}
		}
		return String.format("Request of %s failed %d %s %s %s", resource, response.getStatusInfo().getStatusCode(), response.getStatusInfo().getFamily(), response.getStatusInfo().getReasonPhrase(), errorDetail);
	}
	
}
