package alexei.betfairapi.keystore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

	private String storePassword;
	
	public KeyStoreAuth(String keyStorePassword) {
		this.storePassword = keyStorePassword;
	}
	
	public AuthResult authenticate() throws Exception {

		try (FileInputStream fis = new FileInputStream(InitKeyStore.KEYSTORE_FILE)) {
			KeyStore ks = KeyStore.getInstance("JCEKS");
	
				char [] keyStorePwd = storePassword.toCharArray();
				
				ks.load(fis, keyStorePwd);
		
				PasswordProtection keyStorePP = new PasswordProtection(keyStorePwd);
				
				SecretKeyFactory factory = SecretKeyFactory.getInstance("PBE");
		
				String username = getKeyValue(InitKeyStore.BETFAIR_USERNAME_KEY, ks, keyStorePP, factory);
				String password = getKeyValue(InitKeyStore.BETFAIR_PASSWORD_KEY, ks, keyStorePP, factory);
				String appkey = getKeyValue(InitKeyStore.BETFAIR_APPKEY_KEY, ks, keyStorePP, factory);
				
				return new AuthResult(username, password, appkey);

		} catch (FileNotFoundException fnf) {
			return new AuthResult("Key store "+InitKeyStore.KEYSTORE_FILE+" not found in working directory, run "+InitKeyStore.class.getName()+" to create");
		} catch (Exception e) {
			return new AuthResult("Failed to access secret key store: "+e);
		}

	}

	private String getKeyValue(String key, KeyStore ks,
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
