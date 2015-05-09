package alexei.betfairapi.entities;

public class APINGException {

	public enum ErrorCode {
		
        TOO_MUCH_DATA("The operation requested too much data"),
        INVALID_INPUT_DATA("Invalid input data"),
        INVALID_SESSION_INFORMATION("The session token passed is invalid"),
        NO_APP_KEY("An application key is required for this operation"),
        NO_SESSION("A session token is required for this operation"),
        UNEXPECTED_ERROR("An unexpected internal error occurred that prevented successful request processing"),
        INVALID_APP_KEY("The application key passed is invalid"),
        TOO_MANY_REQUESTS("There are too many pending requests"),
        SERVICE_BUSY("The service is currently too busy to service this request"),
        TIMEOUT_ERROR("Internal call to downstream service timed out"),
        APP_KEY_CREATION_FAILED("The application key creation has failed"),
        DUPLICATE_APP_NAME("The application name specified already exists"),
        APP_CREATION_FAILED("The application name specified is too long"),
        REQUEST_SIZE_EXCEEDS_LIMIT("The request has exceeded the maximum allowed size"),
        ACCESS_DENIED("The access to this functionality is not allowed");

        private String description;
		private ErrorCode(String description) {
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
	}

	private String requestUUID;
	private String errorDetails;

	public String getRequestUUID() {
		return requestUUID;
	}
	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}
	public String getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
	public ErrorCode getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	private ErrorCode errorCode;

	
}

