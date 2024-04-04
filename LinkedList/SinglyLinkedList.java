package first_ideaprogram.src.LinkedList;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    private int size;
    private Node head;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public void insterAtAfterPositionK(int data, int k) {
        Node temp = head;
        for (int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void insterAtBeforePositionK(int data, int k) {
        Node temp = head;
        for (int i = 0; i < k - 2; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void deleteAtK(int k) {
        if (k == 1) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < k - 2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements at the beginning
        list.insertAtStart(3);
        list.insertAtStart(6);
        list.insertAtStart(9);

        // Insert elements at the end
        list.insertAtEnd(8);
        list.insertAtEnd(5);
        list.insertAtEnd(12);

        // Insert elements after specific positions
        list.insterAtAfterPositionK(1, 3);
        list.insterAtAfterPositionK(12, 4);

        // Insert elements before specific positions
        list.insterAtBeforePositionK(7, 3);

        // Delete elements
        list.deleteFirst();
        list.deleteEnd();
        list.deleteEnd();
        list.deleteAtK(3);
        list.deleteAtK(5);

        // Insert recursively
        list.insertRec(70, 3);
        list.insertRec(8, 1);

        // Display the linked list
        System.out.println("Linked List after insertion:");
        System.out.println("Size of List is : " + list.size());
        list.display();
        System.out.println("At index 3 data in node is : " + list.get(2).data);
    }
}
