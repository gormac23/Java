package com.gormac23;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    private int inkCost = 2;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel < 0) {
            this.tonerLevel = 0;
        } else if(tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
    }

    public void fillToner(int refill) {
        if(refill <= 0) {
            System.out.println(refill + " is an invalid toner amount");
        } else if(this.tonerLevel + refill > 100) {
            this.tonerLevel = 100;
            System.out.println("Topping up. Printer toner is full");
        } else {
            this.tonerLevel += refill;
            System.out.println("Topping up printer toner with " + refill + "%. Level is now at " + getTonerLevel() + "%");
        }
    }

    public void print(int amount) {
        if(amount < 1) {
            System.out.println("Invalid number of pages");
        } else {
            if(isDuplex) {
                amount = (amount / 2) + (amount % 2);
                System.out.println("Printing double sides. Total pages to print: " + amount);
            }

            int count = 0;
            while(count != amount) {
                count ++;
                System.out.println("Printing " + count + "/" + amount );
                if (tonerLevel <= 0) {
                    this.tonerLevel = 0;
                    System.out.println("Rang out of ink...");
                    System.out.println((amount-count) + " pages left to print. Please top up toner");
                    break;
                }

                this.pagesPrinted += 1;
                this.tonerLevel -= inkCost;
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
