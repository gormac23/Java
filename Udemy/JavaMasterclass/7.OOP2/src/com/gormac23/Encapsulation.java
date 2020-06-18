package com.gormac23;


// Going to create two Player classes. One that uses the concept of Encapsulation and one without

// ** ENCAPSULATION PROTECTS THE MEMBERS OF THE CLASS AND SOME METHODS **

public class Encapsulation {

    public static void main(String[] args) {

        // This Player class doesn't have private fields or a Constructor. So the fields are named
        // in the main method. This is can lead to the main to manipulating the code
        // This gives people manual access to the class' fields and methods
        Player player = new Player();
        player.name = "Colin";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        System.out.println("\n############################################\n");

        // This EnhancedPlayer class uses Encapsulation. It is built with private fields and uses
        // a Constructor to initialize it's variables and a getter to call the health
        // **NOTE: We can change the field names inside the class and the EnhancedPlayer still works
        // i changed health to hitpoints and everything still works as intended.

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Colin 2.0", 50, "Shiny Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
