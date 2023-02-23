package com.project.urlShortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.urlShortener.entity.ShortUrlEntity;

public interface ShortUrlRepository extends JpaRepository<ShortUrlEntity, Integer> {
}
