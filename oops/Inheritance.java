// Inheritance is all about where one class acquires all its properties,methods,attributes from the parent class
//  -Base Class (Parent/Superclass): The class whose properties and methods are inherited.
//  -Derived Class (Child/Subclass): The class that inherits from another class.
//  -extends Keyword: Used to establish inheritance in Java .
//  You should provide getter setter methods if you want to access private attributes of Animal_id and Animal_name in ExtendInh

public class Animal {
    private int animal_id;
    private String animal_name;

    //java's special constructor
    public Animal(int animal_id, String animal_name) {
        this.animal_id = animal_id;
        this.animal_name = animal_name;
    }

    //getter methods
    public int getAnimal_id() { return animal_id; }

    public String getAnimal_name() { return animal_name; }

    // "A method defines behavior for an object, which is derived from a class."

    public  void makeNoise(){
        System.out.println("Animal makes different noise");
    }

}

public class ExtendsAnimal extend Animal{

    public Animal(int animal_id, String animal_name) {
        super(animal_id, animal_name);
    }

    // The 'super' keyword is used to call parent class constructors, methods, or access protected variables.
    // here we didn't declare any attributes of 'AnimalName' but we can inherit from our parent class

    @Override
    public void makeNoise(){
        System.out.println("I can be a dog" + getAnimal_name());
    }
}
//main class
public class Main {
    public static void main(String[] args) {
        ExtendsAnimal myAnimal = new ExtendsAnimal(1, "Buddy");
        myAnimal.makeNoise();  // Output: I can be a dog Buddy
    }
}
