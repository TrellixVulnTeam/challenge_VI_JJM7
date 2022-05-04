package com.example.demo.model;

public class URL {
    //data
    private String originalURL;
    private String shortURL;

    // stats
    private long timesShortened;
    private long timesAccessed;

    public URL(String originalURL, String shortURL) {
        this.originalURL = originalURL;
        this.shortURL = shortURL;

        this.timesShortened = 1;
        this.timesAccessed = 0;
    }

    public String getOriginalURL() {
        return originalURL;
    }
    public void setOriginalURL(String bigURL) {
        this.originalURL = bigURL;
    }
    public String getShortURL() {
        return shortURL;
    }
    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }
    public long getTimesShortened() {
        return timesShortened;
    }
    public void incrementTimesShortened() {
        this.timesShortened += 1;
    }
    public long getTimesAccessed() {
        return timesAccessed;
    }
    public void incrementTimesAccessed() {
        this.timesAccessed += 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        URL other = (URL) obj;
        if (originalURL == null) {
            if (other.originalURL != null)
                return false;
        } else if (!originalURL.equals(other.originalURL))
            return false;
        if (shortURL == null) {
            if (other.shortURL != null)
                return false;
        } else if (!shortURL.equals(other.shortURL))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "URL [originalURL=" + originalURL + ", shortURL=" + shortURL + ", timesAccessed=" + timesAccessed
                + ", timesShortened=" + timesShortened + "]";
    }

}
