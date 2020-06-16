package com.gormac23;

public class ChallengeVehicle {

    private String engine;
    private String colour;
    private int numOfPassengers;
    private boolean isLandVehicle;

    private int currentVelocity;
    private int currentDirection;

    public ChallengeVehicle(String engine, String colour, int numOfPassengers, boolean isLandVehicle) {
        this.engine = engine;
        this.colour = colour;
        this.numOfPassengers = numOfPassengers;
        this.isLandVehicle = isLandVehicle;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehcile moving at " + currentVelocity +   "km/hr in the direction " + currentDirection);
    }

    public void turn(int degree) {
        this.currentDirection += degree;
        System.out.println("Vehicle is turning");
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public boolean isLandVehicle() {
        return isLandVehicle;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public void setLandVehicle(boolean landVehicle) {
        isLandVehicle = landVehicle;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
