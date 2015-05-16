package alexei.betfairapi;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APINGClientErrorResponse {

	public static class ErrorDetail {
		private String exceptionname;
		private APINGException apingexception;

		public String getExceptionname() {
			return exceptionname;
		}

		public void setExceptionname(String exceptionname) {
			this.exceptionname = exceptionname;
		}

		@JsonProperty("APINGException")
		public APINGException getAPINGException() {
			return apingexception;
		}

		public void setAPINGException(APINGException aPINGException) {
			apingexception = aPINGException;
		}
	}

	private String faultcode;
	private String faultstring;
	private ErrorDetail detail;
	
	private final static Map<String, String> errorDescriptions = new HashMap<>();
	
	static {
		errorDescriptions.put("DSC-0009", "ClassConversionFailure ( Invalid format for parameter, for example passing a string where a number was expected. Can also happen when a value is passed that does not match any valid enum. )");
		errorDescriptions.put("DSC-0018", "MandatoryNotDefined ( A parameter marked as mandatory was not provided )");
		errorDescriptions.put("DSC-0019", "Timeout ( The request has timed out )");
		errorDescriptions.put("DSC-0021", "NoSuchOperation ( The operation specified does not exist )");
		errorDescriptions.put("DSC-0023", "NoSuchService");
		errorDescriptions.put("DSC-0034", "UnknownCaller ( An App Key hasn't been provided in the request )");
		errorDescriptions.put("DSC-0035", "UnrecognisedCredentials");
		errorDescriptions.put("DSC-0036", "InvalidCredentials");
		errorDescriptions.put("DSC-0037", "SubscriptionRequired ( The user is not subscribed to the App Key provided )");
		errorDescriptions.put("DSC-0038", "OperationForbidden ( The App Key sent with the request is not permitted to access the operation )");
	}

	public static String describeError(String errorCode) {
		if (errorDescriptions.containsKey(errorCode)) {
			return errorDescriptions.get(errorCode);
		} else {
			return "";
		}
	}
	
	public ErrorDetail getDetail() {
		return detail;
	}

	public void setDetail(ErrorDetail detail) {
		this.detail = detail;
	}

	public String getFaultcode() {
		return faultcode;
	}

	public void setFaultcode(String faultcode) {
		this.faultcode = faultcode;
	}

	public String getFaultstring() {
		return faultstring;
	}

	public void setFaultstring(String faultstring) {
		this.faultstring = faultstring;
	}

}
