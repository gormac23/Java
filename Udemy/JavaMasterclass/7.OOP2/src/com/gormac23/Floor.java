package com.gormac23;

public class Floor {

    private Dimensions dimensions;
    private String floorType;
    private String colour;

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getFloorType() {
        return floorType;
    }

    public String getColour() {
        return colour;
    }

    public Floor(Dimensions dimensions, String floorType, String colour) {
        this.dimensions = dimensions;
        this.floorType = floorType;
        this.colour = colour;
    }
}
