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

    public List<ShortUrlEntity> getAllShortUrl(){
        return shortUrlRepository.findAll();
    }

}
