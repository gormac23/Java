package com.gormac23;

public class Lamp {

    private int height;
    private boolean isOn;
    private int brightness;

    public Lamp(int height) {
        this.height = height;
        this.isOn = false;
        this.brightness = 100;
    }

    public void togglePower() {
        if(isOn) {
            isOn = false;
            System.out.println("Turning lamp off");
        } else {
            isOn = true;
            System.out.println("Turning lamp on");
        }
    }

    public void adjustBrightness(int intensity) {
        int newBrightness = this.brightness + intensity;
        if(newBrightness <= 0) {
            System.out.println("Lamp dimmed to darkness...");
            togglePower();
        }
        if(newBrightness < this.brightness) {
            System.out.println("Dimming lamp");
        } else {
            System.out.println("Brightening lamp");
        }
        this.brightness = newBrightness;
    }
}

