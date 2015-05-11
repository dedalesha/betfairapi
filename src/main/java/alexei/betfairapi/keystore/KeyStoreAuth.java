package alexei.betfairapi.keystore;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStore.PasswordProtection;
import java.security.KeyStore.SecretKeyEntry;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class KeyStoreAuth {

	private static final String BETFAIR_KEYSTORE_PASSWORD_PROPERTY = "betfair.keystore.password";
	private String username, password, appkey;
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getAppkey() {
		return appkey;
	}

	public static KeyStoreAuth getInstance() throws Exception {

		KeyStore ks = KeyStore.getInstance("JCEKS");

		try (FileInputStream fis = new FileInputStream(InitKeyStore.KEYSTORE_FILE)) {
			
			//TODO: warn if property doesn't exist
			char [] keyStorePwd = System.getProperty(BETFAIR_KEYSTORE_PASSWORD_PROPERTY).toCharArray();
			
			ks.load(fis, keyStorePwd);
	
			PasswordProtection keyStorePP = new PasswordProtection(keyStorePwd);
			
			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBE");
	
			KeyStoreAuth result = new KeyStoreAuth();
			
			result.username = getKeyValue(InitKeyStore.BETFAIR_USERNAME_KEY, ks, keyStorePP, factory);
			result.password = getKeyValue(InitKeyStore.BETFAIR_PASSWORD_KEY, ks, keyStorePP, factory);
			result.appkey = getKeyValue(InitKeyStore.BETFAIR_APPKEY_KEY, ks, keyStorePP, factory);
			
			return result;
		}

	}

	private static String getKeyValue(String key, KeyStore ks,
			PasswordProtection keyStorePP, SecretKeyFactory factory)
			throws NoSuchAlgorithmException, UnrecoverableEntryException,
			KeyStoreException, InvalidKeySpecException {
		SecretKeyEntry ske = (SecretKeyEntry) ks.getEntry(
				key, keyStorePP);
		PBEKeySpec keySpec = (PBEKeySpec) factory.getKeySpec(
				ske.getSecretKey(), PBEKeySpec.class);

		return new String(keySpec.getPassword());
	}
	
}
