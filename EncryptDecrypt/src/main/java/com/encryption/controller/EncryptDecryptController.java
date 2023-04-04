package com.encryption.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.encryption.decryptor.DecryptorService;
import com.encryption.encryptor.EncryptorService;

@RestController
@RequestMapping(path="/api")
public class EncryptDecryptController {
	
	@Autowired
	EncryptorService encryptorService;
	
	@Autowired
	DecryptorService decryptorService;
	
	@PostMapping(path="/encrypt", consumes = "application/json", produces = "application/json")
    public String encrypt(@RequestBody String plainText) {
		System.out.println("reached");
        return encryptorService.encrypt(plainText);
    }

    @PostMapping(path="/decrypt/{encryptedText}")
    public String decrypt(@PathVariable String encryptedText) {
        return decryptorService.decrypt(encryptedText);
    }
}
