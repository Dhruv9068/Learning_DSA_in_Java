package first_ideaprogram.src.Stack;

import java.util.*;

public class InbuiltExample {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Stack: LIFO");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+ "\n");





    }
}
