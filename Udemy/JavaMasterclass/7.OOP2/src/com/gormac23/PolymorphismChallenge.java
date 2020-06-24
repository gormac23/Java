package com.gormac23;

class NewCar{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    private int currentVelocity;

    public NewCar(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;

        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("Car.startEngine called: Engine starting up");
        this.engine = true;
    }

    public void accelerate(int speed) {
        this.currentVelocity += speed;
        System.out.println("Car.accelerate called: Car is accelerating at " + this.currentVelocity + "km/hr");
    }

    public void stop() {
        System.out.println("Car.stop called: Car stopping");
        this.engine = false;
        this.currentVelocity = 0;
    }
}

class Audi extends NewCar {
    public Audi() {
        super("Audi A8", 12);
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("The Audi accelerates");
        super.accelerate(speed);
    }
}

class Ford extends NewCar {
    public Ford() {
        super("Ford Mondeo", 5);
    }

    @Override
    public void startEngine() {
        System.out.println("The Ford engine hums");
        super.startEngine();
    }
}

class MercedesBenz extends NewCar {
    public MercedesBenz() {
        super("Mercedes-Benz C-Class", 4);
    }

    @Override
    public void stop() {
        System.out.println("The Merc screeches to a halt");
        super.stop();
    }
}




public class PolymorphismChallenge {

    public static void main(String[] args) {
        for(int i = 1; i<11; i++) {
            NewCar car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName());
            System.out.println("\nCylinders : " + car.getCylinders());
            System.out.print("\nStart Engine : ");
            car.startEngine();
            System.out.print("\nAccelerate: ");
            car.accelerate(60);
            System.out.print("\nStop : ");
            car.stop();
            System.out.println("\n##########################\n");
        }

    }

    public static NewCar randomCar() {
        int randomNum = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNum);
        switch (randomNum) {
            case 1:
                return new Audi();
            case 2:
                return new Ford();
            case 3:
                return new MercedesBenz();
        }

        return null;
    }
}
