package Arrays.com;


// Amazon question
public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] bs = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(ans(bs, target));
    }
    static int ans(int[] bs , int target){
       int start =0;
       int end = 1;

       while(target > bs[end]){
           int temp = end +1;
           // double the box size
           // end = previous end + sizeofbox*2
           end = end + (end-start +1)*2;
           start = temp;

       }
return BinarySearch(bs , target , start , end);
    }
    static int BinarySearch(int[] bs,int target, int start , int end){




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



        return -1;
    }
}
