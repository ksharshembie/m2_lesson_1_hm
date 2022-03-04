package com.company;

public class MobileDevices extends Electronics {
    private Processor processor;
    private int ram;
    private int rom;

    public MobileDevices(Manufacturer manufacturer, int manufactureYear, Processor processor, int ram, int rom) {
        super(manufacturer, manufactureYear);
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
    }

    public Processor getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String printInfo(){
        return "\nProcessor: " + processor +
                "\nRAM: " + ram +
                "\nROM: " + rom +
                super.printInfo();
    }
    public String printInfo(int ram){
        this.ram = ram;
        return "\nRAM: " + this.ram;
    }

    public final String printInfo(int ram, int rom){
        this.rom = rom;
        this.ram = ram;
        return "\nRAM: " + this.ram
                +
                "\nROM: " + this.rom;
    }


}
