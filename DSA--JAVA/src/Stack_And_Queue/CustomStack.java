package Stack_And_Queue;

public class CustomStack {
    protected int[] data;
    private static final int Default_size = 10;


    int ptr = -1;

    public CustomStack(){
        this(Default_size);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }


        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackExpection{
       if(isEmpty()){
           throw new StackExpection("Cannot pop from an empty stack");
       }

//       int remove = data[ptr];
//       ptr--;
//       return removed;
        return data[ptr--];

    }

    public int peek() throws StackExpection{

        if(isEmpty()){
            throw new StackExpection("cannot peek from an empty stack");
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length -1;
    }
    private boolean isEmpty(){
        return ptr ==-1;
    }
}
