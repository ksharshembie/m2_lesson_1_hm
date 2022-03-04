package com.company;


public final class Smartphone extends MobileDevices {
    private String model;
    private DisplayType display;
    private int antutuRate;
    private Material materialOfCase;
    private OperSystem operationSystem;

    public Smartphone(String model, DisplayType display, int antutuRate, Material materialOfCase,
                      OperSystem operationSystem, Processor processor, int ram, int rom,
                      Manufacturer manufacturer, int manufactureYear) {
        super(manufacturer, manufactureYear, processor, ram, rom);
        this.model = model;
        this.display = display;
        this.antutuRate = antutuRate;
        this.materialOfCase = materialOfCase;
        this.operationSystem = operationSystem;
    }
    public String printInfo(){
        return "\nModel: " + model +
                "\nDisplay: " + display +
                "\nAntutu: " + antutuRate +
                "\nOperation System: " + operationSystem.getSystem() + " " +
                operationSystem.getVersion() +
                "\nCase Material: " + materialOfCase +
                super.printInfo();
    }
}
