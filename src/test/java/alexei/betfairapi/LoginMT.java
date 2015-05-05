package alexei.betfairapi;

public class LoginMT {
	
	public static void main(String[] args) {
		if (args.length<3) {
			System.out.println("params: username password application-key");
			System.exit(-1);
		} else {
			Login.getSessionId(args[0], args[1], args[2]);
		}
	}
	
}
