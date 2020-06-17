package com.gormac23;


// This is an example of OOP Composition
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // instead of having the user call the case and then call the pressPowerButton function
    // This is a form of encapsulation which makes the code more secure
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics code
        monitor.drawPixelAt(11200, 50, "yellow");
    }
}
