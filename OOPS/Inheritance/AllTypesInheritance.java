package first_ideaprogram.src.OOPS.Inheritance;

public class AllTypesInheritance {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Car car = new Car();
        Audi audi = new Audi();
        Bike bike = new Bike();
        Truck truck = new Truck();

        // Calling drive method of each object
        car.drive();  // Output: Driving the car...
        audi.drive(); // Output: Driving the Audi...
        bike.drive(); // Output: Riding the bike...
        truck.drive();// Output: Driving the truck...
    }
}
// Parent class (Base class)
class Vehicle {
    // Method
    void drive() {
        System.out.println("Driving the vehicle...");
    }
}

// Single Inheritance: Car is a subclass of Vehicle
class Car extends Vehicle {
    // Method overriding
    @Override
    void drive() {
        System.out.println("Driving the car...");
    }
}

// Multilevel Inheritance: Audi is a subclass of Car and indirectly inherits from Vehicle
class Audi extends Car {
    // Method overriding
    @Override
    void drive() {
        System.out.println("Driving the Audi...");
    }
}

// Hierarchical Inheritance: Bike and Truck are subclasses of Vehicle
class Bike extends Vehicle {
    // Method overriding
    @Override
    void drive() {
        System.out.println("Riding the bike...");
    }
}

class Truck extends Vehicle {
    // Method overriding
    @Override
    void drive() {
        System.out.println("Driving the truck...");
    }
}