package com.gormac23;


// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class

public class CompositionChallenge{

    public static void main(String[] args) {

        Dimensions wallWidthDimensions = new Dimensions(400, 200, 5);
        Dimensions wallLengthDimensions = new Dimensions(450, 200, 5);
        Dimensions floorDimensions = new Dimensions(400, 450, 2);
        Dimensions ceilingDimensions = floorDimensions;

        Wall widthWall = new Wall(wallWidthDimensions, "Grey", "plain");
        Wall lengthWall = new Wall(wallLengthDimensions, "Orange", "plain");

        Floor floor = new Floor(floorDimensions, "wood", "light brown");

        Ceiling ceiling = new Ceiling(ceilingDimensions, "white");

        Window frontWindow = new Window(new Dimensions(200, 1140, 2));

        Lamp deskLamp = new Lamp(50);

        // ##################################

        Room bedRoom = new Room("bedroom", widthWall, lengthWall, floor, ceiling, frontWindow, deskLamp);
        bedRoom.turnOn();
        bedRoom.getWindow().close();
    }
}
