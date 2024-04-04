package first_ideaprogram.src.OOPS.Inheritance;

public class MultipleInheritanceUsingInterface {
    // java do not having multiple inheritance
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}

    // Interface A
    interface A {
        void methodA();
    }
    // Interface B
    interface B {
        void methodB();
    }
    // Class implementing both interfaces
    class MyClass implements A, B {
        public void methodA() {
            System.out.println("Method A implementation");
        }
        public void methodB() {
            System.out.println("Method B implementation");
        }
    }


