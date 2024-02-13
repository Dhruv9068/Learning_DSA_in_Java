package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodsInStr {
    public static void main(String[] args) {
        String name = "Dhruv Chaturvedi is very Powerfull";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("   kunal  ".strip());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('C'));
    }
}
