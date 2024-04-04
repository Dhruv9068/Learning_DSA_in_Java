package Arrays.com;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {23, 12, 15, 4, 6, 7, 8, 3, 5, 6, 9, 14};
        System.out.println(linearSearch(nums, 6));


    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];

                if (element == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}






