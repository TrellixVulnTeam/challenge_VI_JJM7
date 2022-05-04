package com.example.demo.service;

import java.util.HashMap;

import com.example.demo.model.URL;

import org.springframework.stereotype.Service;


@Service
public class URLShortenerService {

    HashMap<String, URL> URLHashMap = new HashMap<>();

    /**
     * Function to shorten the original URL.
     * @param originalURL The URL to shorten.
     * @return The shortened URL.
     */
    public String shortenURL(String originalURL) {
        String shortURL = Integer.toString(originalURL.hashCode());

        URL URLObject = URLHashMap.get(shortURL);

        if(URLObject != null) {
            URLObject.incrementTimesShortened();
            URLHashMap.put(shortURL, URLObject);

            return shortURL;
        }

        URLHashMap.put(shortURL, new URL(originalURL, shortURL));

        return shortURL;
    }

    /**
     * Gets the original URL based on a shortened URL.
     * @param shortURL The short URL that user wants to know the original.
     * @return The original URL.
     */
    public String getOriginalURL(String shortURL) {

        URL URLObject = URLHashMap.get(shortURL);

        if(URLObject != null) {

            URLObject.incrementTimesAccessed();
            return URLObject.getOriginalURL();
        }

        return null;
    }

    /**
     * gets full url object with stats.
     * @param originalURL The URL that the user wants to know the stats.
     * @return Returns the full object with stats included.
     */
    public URL getStats(String shortURL) {

        System.out.println(shortURL);
        URL URLObject = URLHashMap.get(shortURL);

        if(URLObject != null) {
            return URLObject;
        }

        return null;
    }
    
}