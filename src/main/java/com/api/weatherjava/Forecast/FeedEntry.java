package com.api.weatherjava.Forecast;


public class FeedEntry {

    private static final String ApiKey = "be21a7b7d632fe793ae400e79b44daa9";
    private String Location;
    private String CountryCode;
    private int Days;
    
    public FeedEntry() {
    }

    public FeedEntry(String Location, String CountryCode, int Days) {
        this.Location = Location;
        this.CountryCode = CountryCode;
        this.Days = Days;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public void setDays(int Days) {
        this.Days = Days;
    }

    public int getDays() {
        return Days;
    }

    public String getLocation() {
        return Location;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getApiKey() {
        return ApiKey;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
