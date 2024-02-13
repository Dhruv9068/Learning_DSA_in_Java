package Recursion;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,6};
        int target = 4;
        System.out.println(FindIndex(arr , target , 0));
        System.out.println(FindIndexFromLast(arr , target , arr.length-1));
        FindAllIndex(arr , target , 0);
        System.out.println(list);
        System.out.println(FindAllIndex2(arr , target , 0, new ArrayList<>()));
        System.out.println(FindAllIndex3(arr , target , 0));
    }
    static int FindIndex( int [] arr , int target , int index){
        if( index == arr.length) return -1;

        return arr[index]== target ? index : FindIndex(arr,target , index +1);
    }

    static int FindIndexFromLast( int [] arr , int target , int index){
        if( index == -1) return -1;

        return arr[index]== target ? index : FindIndex(arr,target , index -1);
    }

   static   ArrayList <Integer> list = new ArrayList<>();
    static void FindAllIndex ( int [] arr , int target , int index ) {
        if (index == arr.length) {
           return;
        }


        if (arr[index] == target) list.add(index);
        FindAllIndex(arr, target, index + 1);


    }

    static ArrayList FindAllIndex2 ( int [] arr , int target , int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }


        if (arr[index] == target) list.add(index);
        return FindAllIndex2(arr, target, index + 1, list);


    }

    static ArrayList FindAllIndex3 ( int [] arr , int target , int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }


        if (arr[index] == target) list.add(index);
        ArrayList<Integer> ansFromBelowCalls = FindAllIndex3(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;

    }




}
