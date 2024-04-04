package first_ideaprogram.src.LinkedList;
import java.util.*;


class NewNode {
    int data;
    NewNode next;
    NewNode prev;

    public NewNode(int data) {
        this.data = data;
        this.next = null;
        this.prev= null;
    }
}

class DLinkedList {
    private NewNode head;

    public DLinkedList() {
        this.head = null;
    }

    public void insertAtStart(int data) {
        NewNode newNode = new NewNode(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        NewNode newNode = new NewNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NewNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtAfterPositionK(int data, int k) {
        NewNode temp = head;
        for (int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        NewNode newNode = new NewNode(data);
        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtBeforePositionK(int data, int k) {
        NewNode temp = head;
        for (int i = 0; i < k - 2; i++) {
            temp = temp.next;
        }
        NewNode newNode = new NewNode(data);
        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        if (head != null)
            head.prev = null;
    }

    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        NewNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtK(int k) {
        if (k < 1 || head == null) {
            return;
        }
        if (k == 1) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }
        NewNode temp = head;
        for (int i = 1; i < k - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
        if (temp.next != null)
            temp.next.prev = temp;
    }

    public void display() {
        NewNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();

        // Insert elements at the beginning
        list.insertAtStart(3);
        list.insertAtStart(6);
        list.insertAtStart(9);
        list.insertAtEnd(8);
        list.insertAtEnd(5);
        list.insertAtEnd(12);
        list.insertAtAfterPositionK(1,3);
        list.insertAtAfterPositionK(12,4);
        list.insertAtBeforePositionK(7,3);
        list.deleteFirst();
        list.deleteEnd();
        list.deleteEnd();
        list.deleteAtK(3);
        list.deleteAtK(5);

        // Display the linked list
        System.out.println("Doubly Linked List after insertion:");
        list.display();
    }
}
