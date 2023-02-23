package com.project.urlShortener.rest;

import com.project.urlShortener.entity.ShortUrlEntity;
import com.project.urlShortener.service.ShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/shorturl", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShortUrlRest {

    @Autowired
    private ShortUrlService shortUrlService;

    @GetMapping("")
    public List<ShortUrlEntity> getAllShortUrl(){
        List<ShortUrlEntity> shortUrls = shortUrlService.getAllShortUrl();
        return shortUrls;
    }
}
