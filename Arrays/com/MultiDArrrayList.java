package Arrays.com;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // intialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());

        }

        //add elements

        System.out.println("2d arraylist: ");
    for(int i = 0; i< 3;i++) {
        for (int j = 0; j < 3; j++) {
            list.get(i).add(in.nextInt());
        }

    }
    System.out.println(list);
}
}
