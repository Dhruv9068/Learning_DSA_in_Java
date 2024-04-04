package first_ideaprogram.src.LinkedList.LinkedListQuestions;


class Listn {
    int val;
    Listn next;

    public Listn(int data){
        this.val=data;
        this.next=null;
    }
}
public class ReverseLinkedListII {

    private static Listn head;
    public ReverseLinkedListII() {
        this.head = null;
    }
    public static void main(String[] args) {
        ReverseLinkedListII list = new ReverseLinkedListII();
        list.InsertAtLast(head,1);
        list.InsertAtLast(head,2);
        list.InsertAtLast(head,3);
        list.InsertAtLast(head,4);
        list.InsertAtLast(head,5);
        list.InsertAtLast(head,6);
        list.InsertAtLast(head,7);
        reverseBetween(head,2,5);
        list.display();
    }

    static void InsertAtLast(Listn head, int data){
        Listn newnode = new Listn(data);
        if(head == null){

            head= newnode;
        }
        Listn temp=head;
        while(temp.next==null){
            temp = temp.next;
        }
        temp.next= newnode;

    }
    static void reverseBetween(Listn head, int left, int right) {
        Listn dummy = new Listn(0);
        dummy.next= head;
        
        Listn leftPre = dummy;
        Listn currNode = head;
        
        for(int i=0;i<left-1;i++){
            leftPre=leftPre.next;
            currNode=currNode.next;
        }
        
        Listn sublistHead = currNode;
        
        
        Listn prenode=null;
        for(int i=0;i<=right-left;i++){
            Listn newnode= currNode.next;
            currNode.next=prenode;
            prenode=currNode;
            currNode=newnode;
        }
        
        leftPre.next= prenode;
        sublistHead.next=currNode;
        


    }
    public void display() {
        Listn current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
