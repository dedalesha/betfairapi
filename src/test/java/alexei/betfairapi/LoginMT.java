package alexei.betfairapi;

import org.junit.Assert;

public class LoginMT {
	
	public static void main(String[] args) {
		if (args.length<3) {
			System.out.println("params: username password application-key");
			System.exit(-1);
		} else {
			String sessionId = Login.getSessionId(args[0], args[1], args[2]);
			Assert.assertTrue("Session token has not been received", sessionId!=null && !sessionId.isEmpty());
		}
	}
	
}
