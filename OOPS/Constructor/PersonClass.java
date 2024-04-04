package first_ideaprogram.src.OOPS.Constructor;

public class PersonClass {
    public static void main(String[] args) {
        // Using default constructor
        Person person1 = new Person();
        person1.introduce(); // Output: Hello, my name is Dhruv Chaturvedi and I am 25 years old.

        // Using constructor with arguments
        Person person2 = new Person("Dhruv2", 30);
        person2.introduce(); // Output: Hello, my name is Dhruv2 and I am 30 years old.
    }
}
class Person {
    private String name;
    private int age;

    // Default constructor (no arguments)
    public Person() {
        this.name = "Dhruv Chaturvedi";
        this.age = 21;
    }

    // Constructor with arguments
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
