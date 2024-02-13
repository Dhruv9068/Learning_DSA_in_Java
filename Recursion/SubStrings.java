package Recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStrings {
    public static void main(String[] args) {
           subset("" , "abc");
           System.out.println(subsetArraylist("" , "abc"));
           System.out.println(subsetArraylistASii("" , "abc"));
           subsetASII("" ,"abc");
           int[] arr ={1,2,3};
           List<List<Integer>> ans = subset_using_iteration(arr);
           for(List<Integer> a : ans){
               System.out.println(a);
           }
    }

    static void subset(String p , String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subset(p ,up.substring(1));
        subset(p+ch ,up.substring(1));
    }

    static ArrayList<String> subsetArraylist(String p , String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left= subsetArraylist(p+ch ,up.substring(1));
        ArrayList<String> right =subsetArraylist(p ,up.substring(1));
        left.addAll(right);

        return left;
    }

    static void subsetASII(String p , String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subsetASII(p ,up.substring(1));
        subsetASII(p+ch ,up.substring(1));
        subsetASII(p+(ch+0) ,up.substring(1));
    }
    static ArrayList<String> subsetArraylistASii(String p , String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first= subsetArraylist(p+ch ,up.substring(1));
        ArrayList<String> second =subsetArraylist(p ,up.substring(1));
        ArrayList<String> third =subsetArraylist(p+(ch+0) ,up.substring(1));
        first.addAll(second);
        first.addAll(third);

        return first;
    }



//  Without recurcision iteration method

static List<List<Integer>> subset_using_iteration (int [] arr) {
    List<List<Integer>> outside = new ArrayList<>();
    outside.add(new ArrayList<>());
    for (int num : arr) {
        int n= outside.size();
        for (int i = 0; i < n;i++) {
            List<Integer> internal = new ArrayList<>(outside.get(i));
            internal.add(num);
            outside.add(internal);
        }
    }
    return outside;
}
}

// time complexity( n * 2^N)
// space complexity  o(2^N * N)