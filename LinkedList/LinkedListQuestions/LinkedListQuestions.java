package first_ideaprogram.src.LinkedList.LinkedListQuestions;

class nNode {
    int value;
    nNode next;

    public nNode(int value) {
        this.value = value;
    }

    public nNode(int value, nNode next) {
        this.value = value;
        this.next = next;
    }
}

public class LinkedListQuestions {

    private nNode head;
    private nNode tail;
    private int size;

    public LinkedListQuestions() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        nNode node = new nNode(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public nNode insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return head;
        }
        nNode node = new nNode(val);
        tail.next = node;
        tail = node;
        size++;
        return head;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        nNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        nNode node = new nNode(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private nNode insertRec(int val, int index, nNode node) {
        if (index == 0) {
            nNode temp = new nNode(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        nNode secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        nNode prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public nNode find(int value) {
        nNode node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public nNode get(int index) {
        nNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        if (head == null) {
            return -1; // No element to delete
        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        nNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Remove duplicates from a sorted linked list
    public void removeDuplicates() {
        nNode node = head;

        while (node != null && node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        if (tail != null) {
            tail.next = null;
        }
    }

    public nNode mergeSort(nNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        nNode mid = getMiddle(head);
        nNode nextToMid = mid.next;
        mid.next = null;

        nNode left = mergeSort(head);
        nNode right = mergeSort(nextToMid);

        return merge(left, right);
    }

    private nNode getMiddle(nNode head) {
        if (head == null) {
            return head;
        }
        nNode slow = head;
        nNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private nNode merge(nNode first, nNode second) {
        nNode dummyNode = new nNode(0);
        nNode tail = dummyNode;

        while (first != null && second != null) {
            if (first.value < second.value) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        if (first != null) {
            tail.next = first;
        }
        if (second != null) {
            tail.next = second;
        }

        return dummyNode.next;
    }

    // Bubble sort for the linked list
    // Bubble sort for the linked list
    public void bubbleSort() {
        bubbleSortRecursive(head, null);
    }

    private void bubbleSortRecursive(nNode start, nNode end) {
        if (start == end || start.next == end) {
            return;
        }

        nNode current = start;
        nNode nextNode = start.next;

        while (nextNode != end) {
            if (current.value > nextNode.value) {
                int temp = current.value;
                current.value = nextNode.value;
                nextNode.value = temp;
            }
            current = current.next;
            nextNode = nextNode.next;
        }

        bubbleSortRecursive(start, current);
    }


    public static LinkedListQuestions createList(int... values) {
        LinkedListQuestions list = new LinkedListQuestions();
        for (int value : values) {
            list.insertLast(value);
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedListQuestions first = createList(1, 3, 5, 7);
        LinkedListQuestions second = createList(1, 2, 9, 14);

        System.out.println("First List:");
        first.display();
        System.out.println("Second List:");
        second.display();

        LinkedListQuestions mergedList = new LinkedListQuestions();
        nNode mergedHead = mergedList.merge(first.head, second.head);
        System.out.println("Merged List:");
        mergedList.head=mergedHead;
        mergedList.display();

        LinkedListQuestions newList = new LinkedListQuestions();
        for (int i = 7; i >= 1; i--) {
            newList.insertLast(i);
        }

        System.out.println("Original List:");
        newList.display();

        nNode sortedHead = newList.mergeSort(newList.head);
        System.out.println("Merge Sorted List:");
        newList.head = sortedHead;
        newList.display();

        newList.bubbleSort();
        System.out.println("Bubble Sorted List:");
        newList.display();

    }

}
