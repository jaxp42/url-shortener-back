package com.project.urlShortener.service;


import com.project.urlShortener.entity.ShortUrlEntity;
import com.project.urlShortener.repository.ShortUrlRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ShortUrlService{

    @Autowired
    private ShortUrlRepository shortUrlRepository;

    @Autowired
    private ShortUrlGeneratorService shortUrlGeneratorService;

    public List<ShortUrlEntity> getAllShortUrl(){
        return shortUrlRepository.findAll();
    }

    public ShortUrlEntity findShortUrlByParams(String shortValue){
        List<ShortUrlEntity> shortUrls = shortUrlRepository.findByShortUrl(shortValue);
        ShortUrlEntity shortUrl = null;

        if(!shortUrls.isEmpty()){
            shortUrl = shortUrls.get(0);
        }

        return shortUrl;
    }

    /**
     * Creates the short url data.
     *  1. If is secured then creates first the password.
     *  2. If the password creation fails then doesn't creates the short url.
     *  3. After the password creation creates the short url with after encrypting the data.
     * */
    public ShortUrlEntity createShortUrl(ShortUrlEntity shortUrl){
        if(shortUrl.isSecure()){

        }

        shortUrl.setShortUrl(shortUrlGeneratorService.generateShortUrl());
        ShortUrlEntity createdShortUrl = shortUrlRepository.save(shortUrl);

        return createdShortUrl;
    }

    public void deleteById(int id){
            shortUrlRepository.deleteById(id);
    }

}
