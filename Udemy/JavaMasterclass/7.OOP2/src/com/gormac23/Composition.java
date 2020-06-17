package com.gormac23;

import java.awt.*;

public class Composition {

    // When using inheritance, a dog is part of the animal class
    // but in composition
    // a monitor and motherboard arent part of a PC class. They are PC components
    // So we say that PC is made up of a monitor class and a motherboard class

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-20)", "Asus", 4, 6, "v2.44");

        // Composition is like the opposite of Inheritance
        // The PC object is created by calling the other classes
        // The PC HAS a Case, HAS a monitor and it HAS a motherboard
        // A case by itself isnt a computer. It contracts how a dog is still an animal (inheritance example)

        // Composition is creating objects within objects
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
