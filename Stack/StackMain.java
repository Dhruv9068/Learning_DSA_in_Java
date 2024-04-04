package first_ideaprogram.src.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception, StackException {
        CustomStack stack = new CustomStack(5);
        System.out.println("Stack: LIFO elements that are going to push `5 4 3 2 1 0 , but 0 is not pushable because stack is already full");
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0); // stack is full cannot add 0
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+ "\n");


       //  System.out.print(stack.pop()); // through exception cannot pop


        System.out.println("\nLets try Dynamic stack");
        DynamicStack dstack = new DynamicStack(5);
     //   CustomStack dstack = new DynamicStack(5);   same work as above parent can be as type also
        dstack.push(5);
        dstack.push(4);
        dstack.push(3);
        dstack.push(2);
        dstack.push(1);
        dstack.push(0); // stack never be full even array of length 5
        dstack.push(-1);
        System.out.print(dstack.pop()+" ");
        System.out.print(dstack.pop()+" ");
        System.out.print(dstack.pop()+" ");
        System.out.print(dstack.pop()+" ");
        System.out.print(dstack.pop()+" ");
        System.out.print(dstack.pop()+" ");
        System.out.print(dstack.pop()+ "\n");


    }
}
