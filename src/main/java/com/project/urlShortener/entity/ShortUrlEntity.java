package com.project.urlShortener.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shortUrl")
public class ShortUrlEntity {
    private int id, visitCount;
    private String shortUrl, originalUrl, password;

    public ShortUrlEntity(){}

    public ShortUrlEntity(int id, String shortUrl, String originalUrl, int visitCount, String password){
        this.id = id;
        this.shortUrl = shortUrl;
        this.originalUrl = originalUrl;
        this.visitCount = visitCount;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
