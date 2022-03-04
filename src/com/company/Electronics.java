package com.company;

public abstract class Electronics {
    private Manufacturer manufacturer;
    private int manufactureYear;

    public Electronics(Manufacturer manufacturer, int manufactureYear) {
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String printInfo(){
        return "\nManufacture: " + manufacturer + "\nYear: " + manufactureYear;
    }
}
