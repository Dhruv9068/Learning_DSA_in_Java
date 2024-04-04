package first_ideaprogram.src.Stack;

public class CustomStack {
    protected int [] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data= new int[size];
    }
    public boolean push(int item){

        if(isFull()){
            System.out.println("Stack is FUll! ");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;

    }
    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("Stack is Empty! Cannot pop! ");

        }
        int removed = data[ptr--];
        return removed;

    }
    public int peek() throws StackException{

        if(isEmpty()){
            throw new StackException("Stack is Empty! Cannot peek!");
        }
        return data[ptr];

    }

    public boolean isFull(){
        return ptr==data.length-1; // ptr is at last index
    }

    private boolean isEmpty(){
        return ptr==-1; // ptr is at last index
    }

}
