package com.gormac23;

public class Ceiling {

    private Dimensions dimensions;
    private String colour;

    public Ceiling(Dimensions dimensions, String colour) {
        this.dimensions = dimensions;
        this.colour = colour;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColour() {
        return colour;
    }
}
