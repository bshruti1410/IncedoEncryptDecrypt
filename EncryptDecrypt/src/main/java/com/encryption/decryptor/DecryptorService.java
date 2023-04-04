package com.encryption.decryptor;
import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.stereotype.Service;

@Service
public class DecryptorService {

    private static final String KEY = "secret";

    public String decrypt(String encryptedText) {
        AES256TextEncryptor decryptor = new AES256TextEncryptor();
        decryptor.setPassword(KEY);
        return decryptor.decrypt(encryptedText);
    }

}

