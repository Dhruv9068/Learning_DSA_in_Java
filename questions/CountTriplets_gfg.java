package com.questions;
import java.util.HashSet;


public class CountTriplets_gfg {
    public static void main(String[] args) {

    }

    int countTriplet(int arr[], int n) {

        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (set.contains(sum)) {
                    count++;
                }
            }
        }

        return count;



    }
}
