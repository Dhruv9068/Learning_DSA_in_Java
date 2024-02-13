package Arrays.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>( 10);
        ArrayList<Integer> list = new ArrayList<>( 10);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

System.out.println(numbers.contains(10));
System.out.println(numbers);  // [ 5, 10, 15, 15]
numbers.set(0,2);   // change 0th index to element 2
numbers.remove(3);   //remove element of index 3
System.out.println(numbers);  //[ 2, 10, 15]


        // take a input to a list

        for(int i =0; i<5; i++){
            list.add(in.nextInt());


        }
        for(int i =0; i<5; i++){
            System.out.println(list.get(i));  // pass index here , list[index] not work here
        }


    }

}

