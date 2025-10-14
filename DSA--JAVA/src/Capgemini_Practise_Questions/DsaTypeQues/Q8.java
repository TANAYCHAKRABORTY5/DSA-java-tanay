package Capgemini_Practise_Questions.DsaTypeQues;

import java.util.Stack;

//Implement queue using two stacks.
class MyQueue{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void enqueue(int x){
        st1.push(x);
    }

    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is already empty");
        }

        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is already empty");
        }
        if(st2.isEmpty()){
            while (!st1.isEmpty()){
                st2.push(st2.pop());
            }
        }
        return st2.peek();
    }

    public boolean isEmpty(){
        return st1.isEmpty() && st2.isEmpty();
    }
}


public class Q8 {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20
        System.out.println(q.dequeue()); // 20
        System.out.println(q.dequeue()); // 30
        System.out.println(q.isEmpty()); // true
    }
}
