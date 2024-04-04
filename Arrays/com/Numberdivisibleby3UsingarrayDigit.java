package Arrays.com;

public class Numberdivisibleby3UsingarrayDigit {
    public static void main(String[] args) {
        int N= 3;
        int [] arr ={ 1,2,3};
        System.out.println(isPossible(N,arr));
    }
    static int isPossible(int N, int arr[]) {
        // code here
        int num=0;
        for(int i=0;i<N;i++){
            while(arr[i]>0){
                num+=arr[i]%10;
                arr[i]/=10;
            }
        }
        return(num%3==0)?1:0;
    }
}
