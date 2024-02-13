package com.ApprochesLearned;


// question is Single number
public class Bitmanipulation {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 4, 4};
        System.out.println(findSingleNumber(nums));
    }
    static int findSingleNumber(int[] nums) {
        int result = 0;

        // XOR all elements in the array
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
