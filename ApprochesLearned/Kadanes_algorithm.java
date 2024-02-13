package com.ApprochesLearned;



// question max subarray sum
public class Kadanes_algorithm {
    public static void main(String[] args) {
        int [] arr = {1,2,3,-2,5};
        System.out.println(maxSubarraySum(arr , arr.length));
    }
    static long maxSubarraySum(int arr[], int n){

        long sum =0;
        long max =arr[0];
        for(int i=0 ; i< n ; i++){
            sum = sum + arr[i];
            max = Math.max(sum , max);
            if(sum<0){
                sum=0;
            }
        }
        return max;

    }
}
