package com.gormac23;

// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) DeluxeBurger hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class MasterChallenge {

    public static void main(String[] args) {
        Hamburger burger = new Hamburger("Plain", "White", "Beef", 4.0);
        burger.addExtra("lettuce");
        burger.addExtra("bacon");
        burger.addExtra("cheese");
        burger.addExtra("lettuce");
        burger.addExtra("tomato");
        burger.showPrice();

        System.out.println("\n##################\n");

        HealthyBurger healthy = new HealthyBurger("Quorn");
        healthy.addExtra("cheese");
        healthy.addExtra("lettuce");
        healthy.addExtra("tomato");
        healthy.showPrice();

        System.out.println("\n##################\n");

        DeluxeBurger deluxe = new DeluxeBurger("Seeded Bread", "Chicken");
        deluxe.addExtra("Cheese");
        deluxe.showPrice();
    }
}

class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double basePrice;

    protected String additionals;
    private double extraCost;
    protected int extras = 0;

    public Hamburger(String name, String breadRoll, String meat, double basePrice) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
        this.additionals = "";

        System.out.println("Ordering a " + this.name + " Burger w/ " + this.breadRoll +
                            ", " + this.meat);
    }

    public void addExtra(String topping) {
        topping = topping.toLowerCase();
        if(this.extras < 4) {
            switch (topping) {
                case "lettuce":
                    System.out.println("Adding lettuce to your " + this.name);
                    this.extraCost += 0.5;
                    this.additionals += "Ltc ... 0.50\n";
                    break;
                case "bacon":
                    System.out.println("Adding bacon to your " + this.name);
                    this.extraCost += 1.0;
                    this.additionals += "Bcn ... 1.00\n";
                    break;
                case "tomato":
                    System.out.println("Adding tomato to your " + this.name);
                    this.extraCost += 0.5;
                    this.additionals += "Tmt ... 0.50\n";
                    break;
                case "cheese":
                    System.out.println("Adding cheese to your " + this.name);
                    this.extraCost += 0.5;
                    this.additionals += "Chs ... 0.50\n";
                    break;
                default:
                    System.out.println("Topping not available, please chose from: \n" +
                            "lettuce, bacon, tomato, or cheese");
                    this.extras --;
                    break;
            }
            this.extras ++;
        } else {
            System.out.println("No more toppings allowed");
        }

    }

    public void showPrice() {
        System.out.println(this.name + " ... " + this.basePrice);
        System.out.println(this.additionals);
        System.out.println("Total ... " + (this.basePrice + this.extraCost));
    }
}

class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat) {
        super("Healthy", "Brown-rye Bread Roll", meat, 6.00);
    }

    @Override
    public void addExtra(String topping) {
        this.extras ++; // to only allow 2 toppings
        super.addExtra(topping);
        System.out.println("Only two toppings allowed with Healthy Burger");
    }
}

class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String breadRoll, String meat) {
        super("Deluxe", breadRoll, meat, 10.00);
        super.additionals += "Drk ... 0.00\n" +
                             "Chp ... 0.00\n";
    }

    @Override
    public void addExtra(String topping) {
        System.out.println("No toppings allowed with Deluxe Burger");;
    }
}