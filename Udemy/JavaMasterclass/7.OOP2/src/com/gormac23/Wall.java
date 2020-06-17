package com.gormac23;

public class Wall {

    private Dimensions dimensions;
    private String colour;
    private String pattern;

    public Dimensions getDimenstions() {
        return dimensions;
    }

    public String getColour() {
        return colour;
    }

    public String getPattern() {
        return pattern;
    }

    public Wall(Dimensions dimensions, String colour, String pattern) {
        this.dimensions = dimensions;
        this.colour = colour;
        this.pattern = pattern;
    }
}
