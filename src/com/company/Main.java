package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shelter shelter = new Shelter("Romashka", "Pervomayskaya 4");
        Dog dog = new Dog("Rex", "Ovcharka", new String[]{"Sit", "Down"}, shelter, Color.BLACK);
        System.out.println(dog.getInfoDog() + dog.getInfo());
        dog.makeVoice();
        Shelter shelter1 = new Shelter("Psina", "Gagarina 2");
        Dog dog1 = new Dog("Appa", "Mops", shelter1, Color.WHITE);
        System.out.println(dog1.getInfoDog()+ dog.getInfo());
        dog1.makeVoice("Vau - Vau");
        Dog dog2 = new Dog("Pes","Dvornayshka",Color.BROWN);
        System.out.println(dog2.getInfoDog() + dog.getInfo());
        dog2.makeVoice(3, "Avaf - Avaf");
        Cat cat = new Cat("Kitty", shelter, Color.GRAY);
        System.out.println(cat.getInfoCat() + cat.getInfo());

        MobileDevices objectA = new MobileDevices(Manufacturer.XIAOMI,2021,
                Processor.Qualcomm_Snapdragon_870_5G,8,128);
        System.out.println(objectA.getManufacturer());
        OperSystem android11 = new OperSystem(SystemName.ANDROID,11);
        Smartphone objectB = new Smartphone("Redmi K40",DisplayType.AMOLED,20000,
                Material.GLASS,android11,Processor.Qualcomm_Snapdragon_870_5G, 8,128,
                Manufacturer.XIAOMI,2021);
        Smartphone objectC = new Smartphone("Galaxy A31",DisplayType.AMOLED,12000,
                Material.GLASS,android11,Processor.Samsung_Exynos_990, 6,64,
                Manufacturer.SAMSUNG,2021);
        System.out.println(objectA.printInfo());
        System.out.println(objectA.printInfo(6));
        System.out.println(objectA.printInfo());

        System.out.println(objectB.printInfo());
        System.out.println(objectC.printInfo());
    }
}
