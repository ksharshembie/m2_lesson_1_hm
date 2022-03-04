package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(15) + 1;
    }

    public final String getInfo() {
        if (shelter == null) {
            return "\nAge: " + age
                    + "\nColor: " + color;
        } else {
            return "\nAge: " + age
                    + "\nColor: " + color
                    + "\nShelter Name: " + shelter.getName()
                    + "\nShelter address: " + shelter.getAddress();
        }
    }

    public void makeVoice() {
    }
}
