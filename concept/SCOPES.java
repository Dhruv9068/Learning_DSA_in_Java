package com.concept;

public class SCOPES {
    public static void main(String[] args) {
        int a= 20;
        int b =30;
        {
            int c= 20;
            System.out.println((c));  // use only inside scope
        }
        //       System.out.println((c));  // cannot use varibale outside the scope


        for (int i=10; i<20;i++){
            int d=50;
            System.out.println((d));    // cannout use d outside for scope
        }
       //  System.out.println((d));    give error
    }
}
