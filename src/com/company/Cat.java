package com.company;

public class Cat extends Pet {
    private String name;

    public Cat(String name, Shelter shelter, Color color) {
        this.name = name;
        super.setShelter(shelter);
        super.setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeVoice() {
        System.out.println("Miau - miau");
    }

    public String getInfoCat() {
        return "Name: " + name;
    }
}
