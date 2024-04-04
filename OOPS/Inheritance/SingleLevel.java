package first_ideaprogram.src.OOPS.Inheritance;

import java.util.Scanner;

public class SingleLevel {
    public static void main(String[] args) {
     vehicle v = new vehicle();
     v.color("Berang");
     car c = new car();
     c.Speed(120);
    }
}
class vehicle {

    void color(String color){
        System.out.println("Color of Car is: "+ color);
    }
    void Speed(int s){
        System.out.println("Speed is "+ s);
    }
}

class car extends vehicle{
    @Override
    void color(String color){
        System.out.println("Color of Car is: "+ color);
    }
    @Override
    void Speed(int s){
        System.out.println("Speed is "+ s);
    }
}


