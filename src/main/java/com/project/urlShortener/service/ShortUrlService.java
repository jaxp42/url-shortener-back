package com.project.urlShortener.service;


import com.project.urlShortener.entity.ShortUrlEntity;
import com.project.urlShortener.repository.ShortUrlRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ShortUrlService{

    @Autowired
    private ShortUrlRepository shortUrlRepository;

    public List<ShortUrlEntity> getAllShortUrl(){
        return shortUrlRepository.findAll();
    }

    public List<ShortUrlEntity> findShortUrlByParams(String shortValue){
        return shortUrlRepository.findByShortUrl(shortValue);
    }

    public ShortUrlEntity createShortUrl(ShortUrlEntity shortUrl){
        return shortUrlRepository.save(shortUrl);
    }

    public void deleteById(int id){
            shortUrlRepository.deleteById(id);
    }

}
