package alexei.betfairapi.entities;

public class LoginResult {

	private String token;
	private LoginStatus status;
	private String error;
	private String product;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LoginStatus getStatus() {
		return status;
	}

	public void setStatus(LoginStatus status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
