package com.encryption.encryptor;
import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.stereotype.Service;

@Service
public class EncryptorService {
	
	private static final String KEY = "secret";
	
    public String encrypt(String plainText) {
        AES256TextEncryptor encryptor = new AES256TextEncryptor();
        encryptor.setPassword(KEY);
        return encryptor.encrypt(plainText);
    }
}
