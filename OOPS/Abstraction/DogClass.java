package first_ideaprogram.src.OOPS.Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method
    abstract void makeSound();
}

// Concrete subclass extending the abstract class
class Dog extends Animal {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Main class
public class DogClass {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog();
        
        // Calling the makeSound method without knowing its implementation
        dog.makeSound();
    }
}
