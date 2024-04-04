package first_ideaprogram.src.OOPS.Abstraction.Interface;

// Interface
interface Animal {
    // Method signature
    void makeSound();
}

// Concrete class implementing the interface
class Dog implements Animal {
    // Implementing the method defined in the interface
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Main class
public class AnimalClass {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog();

        // Calling the makeSound method without knowing its implementation
        dog.makeSound();
    }
}

