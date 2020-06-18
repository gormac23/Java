package com.gormac23;

public class EncapsulationChallenge {

    // Create a class and demonstrate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.

    public static void main(String[] args) {

        Printer canon = new Printer(100, false);
        canon.print(40);
        System.out.println("Toner level is at " + canon.getTonerLevel() + "%");
        canon.fillToner(-10);
        canon.fillToner(60);
        canon.print(50);
        canon.fillToner(1000);
        canon.print(10);

        System.out.println("\n######################\n");

        Printer duplexPrinter = new Printer(50, true);
        duplexPrinter.print(40);
        System.out.println("Toner level is at " + canon.getTonerLevel() + "%");
        duplexPrinter.fillToner(-10);
        duplexPrinter.fillToner(60);
        duplexPrinter.print(50);
        duplexPrinter.fillToner(1000);
        duplexPrinter.print(10);

    }
}
