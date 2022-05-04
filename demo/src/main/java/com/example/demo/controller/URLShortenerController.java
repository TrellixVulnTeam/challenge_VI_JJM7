package com.example.demo.controller;

import java.util.Map;

import com.example.demo.model.URL;
import com.example.demo.service.URLShortenerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class URLShortenerController {
    
    @Autowired
    private URLShortenerService shortenerService;

    @ResponseBody
    @PostMapping(value="/shorten")
    public String shortenURL(@RequestBody Map<String,String> requestBody){

        // System.out.println(originalURL);
        // System.out.println(originalURL.get("originalURL"));

        String originalURL = requestBody.get("originalURL");

        if(originalURL == null) {
            return "";
        }

        String shortURL = shortenerService.shortenURL(originalURL);

        return shortURL;
    }

    @ResponseBody
    @GetMapping(value="/original/{url}")
    public String getBigURL(@PathVariable("url") String shortURL){

        String originalURL = shortenerService.getOriginalURL(shortURL);
        
        return originalURL;
    }

    @ResponseBody
    @GetMapping(value="/stats/{url}")
    public URL getStats(@PathVariable("url") String originalURL){

        URL URLObject = shortenerService.getStats(originalURL);

        System.out.println(URLObject);

        return URLObject;
    }
}
