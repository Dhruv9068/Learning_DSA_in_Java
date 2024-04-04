package Arrays.com;

import java.util.Arrays;

public class PassingArrayFunction {

    public static void main(String[] args) {
        int [] arr = {5,4,3,2};
        System.out.println(Arrays.toString(arr));
        changeArr(arr);
        System.out.println("After change:" + Arrays.toString(arr));



    }
    static void changeArr(int [] nums){
        nums[0]=9;

    }
}
