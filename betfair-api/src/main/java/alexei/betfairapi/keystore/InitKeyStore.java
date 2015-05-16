package alexei.betfairapi.keystore;

import java.io.FileOutputStream;
import java.security.KeyStore;
import java.security.KeyStore.PasswordProtection;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class InitKeyStore {

	static final String BETFAIR_USERNAME_KEY = "BETFAIR_USERNAME";
	static final String BETFAIR_PASSWORD_KEY = "BETFAIR_PASSWORD";
	static final String BETFAIR_APPKEY_KEY = "BETFAIR_APPKEYKEY";
	private static final byte [] SALT = {34, 5, 9, 66, 4, 66, 90, 31};
	private static final int ITERATIONS = 20000;
	
	static final String KEYSTORE_FILE = "betfairauth.jceks";

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out
					.println("Params: <keystore password> <betfair username> <betfair password> <betfair app key>");
		} else {

			char[] keyStorePwd = args[0].toCharArray();
			char[] betfairUserName = args[1].toCharArray();
			char[] betfairPwd = args[2].toCharArray();
			char[] betfairAppKey = args[3].toCharArray();

			KeyStore ks = KeyStore.getInstance("JCEKS");
			ks.load(null, keyStorePwd);
			PasswordProtection keyStorePP = new PasswordProtection(keyStorePwd);

			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBE");

			ks.setEntry(
					BETFAIR_USERNAME_KEY,
					new KeyStore.SecretKeyEntry(
							factory.generateSecret(new PBEKeySpec(betfairUserName, SALT, ITERATIONS))
						),
					keyStorePP);

			ks.setEntry(
					BETFAIR_PASSWORD_KEY,
					new KeyStore.SecretKeyEntry(
							factory.generateSecret(new PBEKeySpec(betfairPwd, SALT, ITERATIONS))
						),
					keyStorePP);

			ks.setEntry(
					BETFAIR_APPKEY_KEY,
					new KeyStore.SecretKeyEntry(
							factory.generateSecret(new PBEKeySpec(betfairAppKey, SALT, ITERATIONS))
						),
					keyStorePP);

			try (FileOutputStream fos = new FileOutputStream(
					KEYSTORE_FILE)) {

				ks.store(fos, keyStorePwd);
				
			}
		}
	}

}
