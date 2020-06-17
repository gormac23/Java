package com.gormac23;

public class Room {

    private String roomType;

    private Wall wallWidth;
    private Wall wallLength;
    private Floor floor;
    private Ceiling ceiling;
    private Window window;
    private Lamp lamp;

    public Room(String roomType, Wall wallWidth, Wall wallLength, Floor floor, Ceiling ceiling, Window window, Lamp lamp) {
        System.out.println(wallLength.getColour() + " and " + wallWidth.getColour() + " " + roomType + " created.");
        this.roomType = roomType;
        this.wallWidth = wallWidth;
        this.wallLength = wallLength;
        this.floor = floor;
        this.ceiling = ceiling;
        this.window = window;
        this.lamp = lamp;
    }

    public Window getWindow() {
        return window;
    }

    public void turnOn() {
        lamp.togglePower();
        drawCurtains();
    }

    private void drawCurtains(){
        window.close();
    }
}
