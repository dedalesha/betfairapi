package alexei.betfairapi.keystore;

public class AuthResult {

	private String username, password, appkey;
	private String errorMessage;
	private boolean successful;

	public AuthResult(String username, String password, String appkey) {
		this.username = username;
		this.password = password;
		this.appkey = appkey;
		this.successful = true;
	}
	
	public AuthResult(String errorMessage) {
		this.errorMessage = errorMessage;
		this.successful = false;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
		
	public boolean isSuccessful() {
		return successful;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getAppkey() {
		return appkey;
	}
	
}
