package com.example.tariklabrab3;

public class Capital extends City {
    private String country;

    public Capital(String name, int population, String country) {
        super(name, population);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Страна: " + country);
    }
}
