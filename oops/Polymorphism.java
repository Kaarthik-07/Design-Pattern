
//polymorphism -> refers to ability to display a message in different forms
//poly -> refers to many
//forms -> refers to many forms

//Two types of polymorphism
// -Compile/static time polymorphism ->  method overloading
// -RunTime/dynamic polymorphism -> method overriding

//method overloading refers to same method name but with different parameter which should be done with in the same class
//where is in overriding same method name but can be done in extension of other class

//----------------------------------------------------LET'S COOK-------------------------------------------------------------------
public class Overloading {
    private int height;
    private int width;

    // Method 1: Draw with height and width
    void draw(int height, int width) {
        System.out.println(height + width);// Op -> 50
    }

    // Method 2: Draw with only height
    void draw(int size) {
        System.out.println(size); // Op -> 7
    }

    // Method 3: Draw with height, width, and a character (for styled drawing)
    void draw(int height, int width, char style) {
      System.out.println(height + " " + width + " " + style); // Op-> 5 10 *
    }
    

    public static void main(String[] args) {
        Polymorphism shape = new Polymorphism();

        shape.draw(5, 10); // Calls method with two parameters
        shape.draw(7);     // Calls method with one parameter
        shape.draw(4, 8, '*'); // Calls method with three parameter
    }
}
//method overriding
class Overriding {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Overriding {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
    void callParentSound(){
      super.makeSound();
    }
}

public class Main {
    public static void main(String[] args) {
        Overriding myDog = new Dog(); // creating an obj
        myDog.makeSound(); // Calls Dog's overridden method (Runtime polymorphism)
        myDog.callParentSound();
    }
}
