package com.example.tariklabrab3;

public class City {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void displayInfo() {
        System.out.println("Город: " + name);
        System.out.println("Население: " + population);
    }
}
