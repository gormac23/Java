package com.gormac23;

public class ChallengeCar extends ChallengeVehicle {

    private String brand;
    private int doors;
    private int wheels;
    private int gears;
    private  boolean isManual;

    private int currentGear;

    public ChallengeCar(String engine, String colour, int numOfPassengers, String brand, int doors, int wheels, int gears, boolean isManual) {
        super(engine, colour, numOfPassengers, true);
        this.brand = brand;
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Change gear to " + this.currentGear + " gear");
    }

    public void turnSteeringWheel(char direction) {
        switch (direction) {
            case 'l':
                System.out.println("Car is turning left");
                break;
            case 'r':
                System.out.println("Car is turning right");
                break;
            default:
                System.out.println("Error turning car...");
        }
    }

    @Override
    public void turn(int degree) {
        super.turn(degree);

        if(degree < 0 && degree >= -90) {
            turnSteeringWheel('l');
        } else if(degree > 0 && degree <= 90) {
            turnSteeringWheel('r');
        } else {
            turnSteeringWheel('?');
        }
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car changed velocity: Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    public int getGears() {
        return gears;
    }
}
