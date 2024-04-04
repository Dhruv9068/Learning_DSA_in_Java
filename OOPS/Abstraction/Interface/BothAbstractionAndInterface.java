package first_ideaprogram.src.OOPS.Abstraction.Interface;

// Interface
interface Shape {
    // Abstract method
    double area();
}

// Abstract class implementing the interface
abstract class AbstractShape implements Shape {
    // Common attribute for all shapes
    String name;

    // Constructor
    AbstractShape(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract double area();
}

// Concrete subclass extending the abstract class
class Rectangle extends AbstractShape {
    // Attributes specific to Rectangle
    double length;
    double width;

    // Constructor
    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    public double area() {
        return length * width;
    }
}

// Concrete subclass extending the abstract class
class Circle extends AbstractShape {
    // Attribute specific to Circle
    double radius;

    // Constructor
    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Implementing the abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class BothAbstractionAndInterface {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Rectangle rectangle = new Rectangle("Rectangle", 5, 3);
        Circle circle = new Circle("Circle", 4);

        // Calling the area method without knowing the internal workings
        System.out.println("Area of " + rectangle.name + ": " + rectangle.area());
        System.out.println("Area of " + circle.name + ": " + circle.area());
    }
}
