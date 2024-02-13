package Arrays.com;

public class OrderAgnosticBinarySearchCode {
    public static void main(String[] args) {
        int[] bs ={18, 17 ,16,5,4,3,2,1 };
        int target = 5;
        System.out.println(BinarySearch(bs , target));
    }

    static int BinarySearch(int[] bs,int target){
// this will for any type of array decending or accending sorted array
        int start =0;
        int end = bs.length -1;

        if(bs[start]<bs[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == bs[mid]) {
                    return mid;
                } else if (target > bs[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }
        }

        else{
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == bs[mid]) {
                    return mid;
                } else if (target > bs[mid]) {
                    start = mid - 1;

                } else {
                    end = mid + 1;
                }
            }
        }

     return -1;
    }
}
