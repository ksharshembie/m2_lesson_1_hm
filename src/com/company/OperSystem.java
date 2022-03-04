package com.company;

public class OperSystem {
   private SystemName system;
   private int version;

    public OperSystem(SystemName system, int version) {
        this.system = system;
        this.version = version;
    }

    public SystemName getSystem() {
        return system;
    }

    public int getVersion() {
        return version;
    }
}
