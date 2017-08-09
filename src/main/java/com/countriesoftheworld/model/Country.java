package com.countriesoftheworld.model;


public class Country {
    private String countryName;
    private int population;
    private String capitalCity;
    private String officialLanguage;

    public Country(String countryName, int population, String capitalCity, String officialLanguage){
        this.countryName = countryName;
        this.population = population;
        this. capitalCity = capitalCity;
        this.officialLanguage = officialLanguage;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }
}
