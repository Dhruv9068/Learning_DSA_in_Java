package first_ideaprogram.src.LinkedList.LinkedListQuestions;

class NNode {

    int value;
    NNode next;

    public NNode(int value) {
        this.value = value;
    }

    public NNode(int value, NNode next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedListC {

    private int size;
    public NNode head;

    public LinkedListC() {
        this.head = null;
        this.size = 0;
    }

    public void insertAtEnd(int data) {
        NNode newNode = new NNode(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        NNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public boolean hasCycle() {
        if (head == null || head.next == null) {
            return false;
        }

        NNode slow = head;
        NNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    public NNode detectCycleStart() {
        if (head == null || head.next == null) {
            return null; // No cycle
        }

        NNode slow = head.next;
        NNode fast = head.next.next;

        // Find the meeting point
        while (fast != null && fast.next != null && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // If there is no cycle, return null
        if (slow != fast) {
            return null;
        }

        // Move slow pointer back to head
        slow = head;

        // Move both pointers at the same pace until they meet at the start of the cycle
        while (slow != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // This is the start of the cycle
    }
}

public class LinklistCycle {

    public static void main(String[] args) {
        LinkedListC list = new LinkedListC();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        // Creating a cycle for testing purposes
        list.head.next.next.next.next.next = list.head.next; // Creating a cycle between node with value 5 and node with value 2

        System.out.println("Does the linked list have a cycle? " + list.hasCycle()); // Output: true

        NNode cycleStartNode = list.detectCycleStart();
        if (cycleStartNode != null) {
            System.out.println("The cycle begins at node with value: " + cycleStartNode.value); // Output: 2
        } else {
            System.out.println("The linked list doesn't have a cycle.");
        }
    }
}
