package first_ideaprogram.src.LinkedList.LinkedListQuestions;


import java.util.List;

class ListNode{
    int data;
    ListNode next = null;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

class LL {
    private ListNode head = null;
    private ListNode tail = null;
    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            tail=newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail=newNode;

    }
   public void reverseUsingRec(){
        reverseUsingRec(head);
   }
    private void reverseUsingRec (ListNode node){
        if(node ==tail){
            head=tail;
            return;
        }
        reverseUsingRec(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public ListNode reverse (){
       ListNode temp1 =null;
       ListNode temp2= null;
       while(head!=null){
           temp2=head.next;
           head.next=temp1;
           temp1=head;
           head=temp2;
       }
       head=temp1;
       return head;
    }


    public void display(){
        ListNode temp = head;
        while (temp !=null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

}
public class ReverseLLUsingRecursion {
    public static void main(String[] args) {
       LL newlist = new LL();
        for (int i = 7; i >= 1; i--) {
            newlist.insertAtEnd(i);
        }

        newlist.display();
        newlist.reverseUsingRec();
        newlist.display();
        newlist.reverse();
        newlist.display();

    }
}
