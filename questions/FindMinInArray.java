package com.questions;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] nums = {23, 12, 15, 4, 6, 7, 8, 3, 5, 6, 9, 14};
        System.out.println(min(nums));
    }

    public static int min(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        int minElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (minElement > nums[i]) {
                minElement = nums[i];
            }
        }
        return minElement;
    }
}
