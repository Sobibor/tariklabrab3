package com.example.tariklabrab3;

public class Town extends City {
    private boolean hasUniversity;

    public Town(String name, int population, boolean hasUniversity) {
        super(name, population);
        this.hasUniversity = hasUniversity;
    }

    public boolean isHasUniversity() {
        return hasUniversity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Наличие колледжа/университета: " + (hasUniversity ? "Да" : "Нет"));
    }
}
