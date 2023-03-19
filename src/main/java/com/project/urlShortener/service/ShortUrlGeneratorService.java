package com.project.urlShortener.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ShortUrlGeneratorService {

    @Autowired
    EncryptionService encryptionService;

    /*
    * Having 5 position in each short url. We will have V62,5 possible variations.
    * The calc will be:
    *   V62,5 = 62! / (62 - 5)!
    *   776.520.240 possible variations.
    * */
    private final String VALID_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();


    public String generateShortUrl() {
        String shortUrl = null;

        try{
            shortUrl = getRandomShortUrl();
        }catch (Exception e){
            System.out.println("Error generating the short url hash");
            e.printStackTrace();
        }

        return shortUrl;
    }

    private String getRandomShortUrl(){
        String randomUrl = "";

        for(int i = 0; i < 5; i++){
            randomUrl += "" + VALID_CHARACTERS.charAt(random.nextInt(VALID_CHARACTERS.length()));
        }

        return randomUrl;
    }


}
