# Section 6: Object-Oriented Programming Part 1
## Classes, Constructors and Inheritance

- A **class** is like the blueprint for a house, we can use it as many times to build as many houses as we like
- An **object** is a new *instance* of the house that we use to build a *new* house with the *new* operator
- A **reference** is like the house address. There is only one address for every house, like there is one *reference* for every *object*.
You can write the address on another piece of paper (creating a new variable), but the address is still the same. We can
pass **references** as **parameters** to **constructors** and **methods** 

### Code Example
```java
class House {   // creating class
  
  private String colour;    // Field variable. Should be private
  
  public House(String colour) {   // Constructor. Has same name as class.
    this.colour = colour;         // There can be multiple Constructors in a class
  }                               // colour is the reference to the parameter passed
                                  // this. is a reference to the field variable with the same name
  
  public String getColour() {   // Getter. Is a public method used to 'get' the
    return colour;              // field variables of the class
  }
  
  public void setColour(String colour) {    // Setter. Like Getter. Public method used
    this.colour = colour;                   // to set the variables.
  }                                         
                                            // Getters & Setters are examples of Encapsulation
}  
  
public class Main {

  public static void main(String[] args) {
  
    House blueHouse = new House("blue");    // How to create new object of type House using our House class
    House anotherHouse = blueHouse;         // We used new to create a new instance but for anotherHouse,
                                            // we just referenced blueHouse. So the two difference objects
  }                                         // reference the same address

}
```
\

### this vs super
- **super** is used to access/call the parent class members (variables and methods)
- **this** is used to call the current class memebers (variables and methods). This is required when
we have the same anme as an instance variable (see code above using `this.colour`)
- **NOTE:** They can be used anywhere in a class except in **static** areas
```java
class Animal {    // another class example

  private String name;    // setting up field variables
  private int height;
  private int weight;
  
  public Animal(String name, int height, int weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }
  
  public getName() {    // don't need this when using a getter
    return name;
  }
  
  public setHeight(int height) {    // use this when using setters
    return this.height = height
  }
  
}

// All dogs are animals, but not all animals are dogs

class Dog extends Animal {    // subclass example. Dog extends the superclass Animal

  private String breed;   // this is the Dog class' field variables but it also has
  private int legs;       // access to the Animal field variables through the 
  private String coat;    // constructor class below
  
  public Dog(String name, int height, int weight, String breed, int legs, String coat) {
        super(name, height, weight);    // note the use of super here to call the superclass variables
        this.breed = breed;             // and the this here to call the instance variables
        this.legs = legs;
        this.coat = coat;
        }

}
```
