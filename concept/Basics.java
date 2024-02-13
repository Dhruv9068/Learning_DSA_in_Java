package com.concept;

public class Basics {
    public static void main(String[] args){
        int a =10;
        if(a==10){
            System.out.println("Hn bhai if ke andr ka hai ye");
        }


        //while loop
        int count = 1;
        while(count != 5){
            System.out.println("the count is now  in while loop  " + count);
            count+=1;

        }
        System.out.println("\n");
        System.out.println("NOW  FOR LOOP");
        System.out.println("\n");

        //for loop
        for(count = 1 ; count != 5 ; count++){
            System.out.println("the count is now in for loop  " + count);
        }
    }
}
