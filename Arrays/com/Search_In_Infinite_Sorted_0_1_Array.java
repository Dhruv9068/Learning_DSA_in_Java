package Arrays.com;

public class Search_In_Infinite_Sorted_0_1_Array {
    public static void main(String[] args) {

    }
    public static long firstOne()
    {
        // Write your code here.
        long i = 0;
        long j = 1;
//        while(Runner.get(j)!=1){
//            i = j;
//            j = 2*j;
//        }
        long ans = 0;
        long mid = 0;
        while(i<=j){
            mid = i+((j-i)/2);
//            if(Runner.get(mid) == 1){
//                ans = mid;
//                j = mid-1;
//            }
//            else{
//                i = mid+1;
//            }
        }
        return ans;
    }
}
