package com.project.urlShortener.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shortUrl")
public class ShortUrlEntity {
    private Long id;
    private int visitCount;
    private String shortUrl, originalUrl;
    private boolean secure;

    public ShortUrlEntity(){}

    public ShortUrlEntity(Long id, String shortUrl, String originalUrl, int visitCount, boolean secure){
        this.id = id;
        this.shortUrl = shortUrl;
        this.originalUrl = originalUrl;
        this.visitCount = visitCount;
        this.secure = secure;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }
}
