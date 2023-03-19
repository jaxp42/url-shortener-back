package com.project.urlShortener.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class EncryptionService {

    /**
     * Hashes a text using SHA-512 algorithm.
     * **/
    String getHashedText(String text) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");

        messageDigest.reset();
        messageDigest.update(text.getBytes(StandardCharsets.UTF_8));

        return String.format("%0128x", new BigInteger(1, messageDigest.digest()));
    }

}
