package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsetdublicate {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3};
        List<List<Integer>> ans = subset_using_iteration(arr);
        for(List<Integer> a : ans){
            System.out.println(a);
        }
    }

    static List<List<Integer>> subset_using_iteration (int [] arr) {
        List<List<Integer>> outside = new ArrayList<>();
        outside.add(new ArrayList<>());
        int s=0;
        int e=0;
        for (int i=0;i<arr.length;i++) {
            s=0;
            if(i>0 && arr[i]==arr[i-1]){
                s=e+1;
            }
            e = outside.size()-1;


            int n= outside.size();
            for (int j= 0; j < n;j++) {
                List<Integer> internal = new ArrayList<>(outside.get(j));
                internal.add(i);
                outside.add(internal);
            }
        }
        return outside;
    }
}
