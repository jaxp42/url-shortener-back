package com.project.urlShortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.urlShortener.entity.ShortUrlEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShortUrlRepository extends JpaRepository<ShortUrlEntity, Integer> {

    @Query("select su from ShortUrlEntity su where shortUrl = ?1")
    List<ShortUrlEntity> findByShortUrl(String shortUrl);
}
