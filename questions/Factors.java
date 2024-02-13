package com.questions;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factors2(20);
        factors3(20);
    }

    // bruteforce approach
    static void factors1(int n){
        for (int i =1; i<=n;i++){
            if(n % i == 0 ){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
    // Time complexity : O(n)


    static void factors2(int n){
        for (int i =1; i<=Math.sqrt(n);i++){
            if(n % i == 0 ){
                if(n/i == i) System.out.print(i + " ");   // for 36 = 6*6 both same
                else System.out.print(i + " " + n/i +" ");   // ex 20%2  = 2 * 10 both
            }
        }
        System.out.println();

    }
    // not giving in sorted order

    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =1; i<=Math.sqrt(n);i++){
            if(n % i == 0 ){
                if(n/i == i) System.out.println(i + " ");
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }

            }

        }
        for( int i =list.size()-1 ; i >=0; i--){
            System.out.print(list.get(i) + " ");
        }

    }

    // time complexity : O(sqrt(n))

//- The first loop runs for at most (sqrt(n) iterations.
//- Inside the first loop, the if condition and printing operations are constant time.
//- The second loop iterates over the elements in `list`, which has at most (sqrt(n)) elements.



}
