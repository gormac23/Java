# Section 6: Object-Oriented Programming Part 1
## Classes, Constructors and Inheritance

- A **class** is like the blueprint for a house, we can use it as many times to build as many houses as we like
- An **object** is a new *instance* of the house that we use to build a *new* house with the *new* operator
- A **reference** is like the house address. There is only one address for every house, like there is one *reference* for every *object*.
You can write the address on another piece of paper (creating a new variable), but the address is still the same. We can
pass **references** as **parameters** to **constructors** and **methods** 
\
### Code Example
```java
class House {   // creating class
  
  private String colour;    // Field variable. Should be private
  
  public House(String colour) {   // Constructor. Has same as class.
    this.colour = colour;         // There can be multiple Constructors in a class
  }
  
  public String getColour() {   // Getter. Is a public method used to 'get' the
    return colour;              // field variables of the class
  }
  
  public void setColour(String colour) {    // Setter. Like Getter. Public method used
    this.colour = colour;                   // to set the variables.
  }                                         // Getters & Setters are examples of Encapsulation
