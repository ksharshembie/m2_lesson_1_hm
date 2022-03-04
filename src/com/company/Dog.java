package com.company;

import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, String[] commands, Shelter shelter, Color color) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColor(color);
    }

    public Dog(String name, String breed, Shelter shelter, Color color) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColor(color);
    }

    public Dog(String name, String breed, Color color) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice() {
        System.out.println("Gav-Gav");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(int count, String voice) {
        while (count > 0) {
            System.out.println(voice);
            count--;
        }
    }


    public String getInfoDog() {
        if (commands == null) {
            return "Name: " + name
                    + "\nBreed: " + breed;
        } else {
            return "Name: " + name
                    + "\nBreed: " + breed
                    + "\nCommands: " + Arrays.toString(commands);
        }
    }
}
