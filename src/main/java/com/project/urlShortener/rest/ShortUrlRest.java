package com.project.urlShortener.rest;

import com.project.urlShortener.entity.ShortUrlEntity;
import com.project.urlShortener.service.ShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/shorturl", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShortUrlRest {

    @Autowired
    private ShortUrlService shortUrlService;

    @GetMapping("")
    public ResponseEntity<List<ShortUrlEntity>> getAllShortUrl(){
        List<ShortUrlEntity> shortUrls = shortUrlService.getAllShortUrl();
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", "*")
                .body(shortUrls);
    }

    @GetMapping("/find")
    public ResponseEntity<ShortUrlEntity> getShortUrlByShortValue(@RequestParam("shortValue") String shortValue){
        ShortUrlEntity shortUrl = shortUrlService.findShortUrlByParams(shortValue);
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", "*")
                .body(shortUrl);
    }

    @PostMapping("")
    public ResponseEntity<ShortUrlEntity> createShortUrl(@RequestBody ShortUrlEntity shortUrl){
        ShortUrlEntity createdShortUrl = shortUrlService.createShortUrl(shortUrl);

        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", "*")
                .body(createdShortUrl);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id){
            shortUrlService.deleteById(id);
    }
}
