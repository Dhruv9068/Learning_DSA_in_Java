package first_ideaprogram.src.LinkedList;

class CNode {
    int data;
    CNode next;

    public CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CLinkedList {
    private CNode head;

    public CLinkedList() {
        this.head = null;
    }

    public void insertAtStart(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Circular reference
        } else {
            newNode.next = head;
            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Circular reference
        } else {
            CNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Circular reference
        }
    }

    public void insterAtAfterPositionK(int data, int k) {
        CNode temp = head;
        for (int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        CNode newNode = new CNode(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insterAtBeforePositionK(int data, int k) {
        CNode temp = head;
        for (int i = 0; i < k - 2; i++) {
            temp = temp.next;
        }
        CNode newNode = new CNode(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteEnd() {
        if (head == null) {
            return;
        }
        CNode temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }

    public void deleteAtK(int k) {
        if (head == null || k < 1) {
            return;
        }
        if (k == 1) {
            head = head.next;
            return;
        }
        CNode temp = head;
        for (int i = 1; i < k - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            return;
        }
        temp.next = temp.next.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        CNode current = head;
        do {
            System.out.print(current.data + "-->");
            current = current.next;
        } while (current != head);
        System.out.print(6);
        System.out.println();
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CLinkedList list = new CLinkedList();

        // Insert elements at the beginning
        list.insertAtStart(3);
        list.insertAtStart(6);
        list.insertAtStart(9);
        list.insertAtEnd(8);
        list.insertAtEnd(5);
        list.insertAtEnd(12);
        list.insterAtAfterPositionK(1,3);
        list.insterAtAfterPositionK(12,4);
        list.insterAtBeforePositionK(7,3);
        list.deleteFirst();
        list.deleteEnd();
        list.deleteEnd();
        list.deleteAtK(3);
        list.deleteAtK(5);

        // Display the linked list
        System.out.println("Circular Linked List after insertion:");
        list.display();
    }
}
