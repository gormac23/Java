package com.gormac23;

public class Window {

    private Dimensions dimensions;
    private boolean curtainsOpen;

    public Window(Dimensions dimensions) {
        this.dimensions = dimensions;
        this.curtainsOpen = true;
    }

    public void close() {
        if(curtainsOpen) {
            curtainsOpen = false;
            System.out.println("Closing curtains");
        } else {
            System.out.println("Curtains already closed");
        }
    }
}
