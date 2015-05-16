package alexei.betfairapi;

import org.junit.Assert;

public class LoginMT {
	
	public static void main(String[] args) {
		Login.login();
		String sessionId = Login.getSessionId();
		Assert.assertTrue("Session token has not been received", sessionId!=null && !sessionId.isEmpty());
	}
	
}
