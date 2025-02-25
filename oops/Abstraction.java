
// - An abstract class is a class that cannot be instantiated (you can't create objects from it).
// - However, you can create subclasses that extend the abstract class, and those subclasses can be instantiated.
// why do u need abstraction? -> well hiding implementation details only expose the necessary functionalities, it improves code reusability and maintainability


// -------------------------------------------------------Lets Cook-----------------------------------------------------------------

// Abstract class that cannot be instantiated
public abstract class Animal {
    private int age;
    private String name;

    // Abstract method (must be implemented by subclasses)
    //whenever u want to implement an abstract method you won't specify the body for that , all u do is declare and end with a ';'
    public abstract void makeNoise();
}

// Dog class extends Animal and provides implementation for makeNoise()
class Dog extends Animal {

    // Best practice: Use @Override annotation for clarity
    @Override
    public void makeNoise() {
        System.out.println("Bow Bow");
    }

    // Why use an abstract class? 
    // - All animals have properties like age and name.
    // - But different animals make different sounds.
    // - Instead of redefining "makeNoise()" in every subclass, we enforce a common structure!
    // - That's what all abt oops following best practices and making code easier

}

// Main function to test abstraction
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeNoise(); // Output: Bow Bow
    }
}
