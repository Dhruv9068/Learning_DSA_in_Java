package first_ideaprogram.src.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class StackUsingLinkedList {
    private ListNode top;

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int x) {
        ListNode newNode = new ListNode(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedValue = top.val;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
