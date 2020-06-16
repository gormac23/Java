package com.gormac23;

public class ChallengeMrBeanCar extends ChallengeCar {
    private int roadServiceMonths;

    public ChallengeMrBeanCar(int roadServiceMonths) {
        super("small", "green", 4, "Mini" , 3, 3, 4, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }

}
