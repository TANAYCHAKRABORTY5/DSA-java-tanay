package Stack_And_Queue;

public class QueueMain {

    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//
//        queue.display();

        CircularQueue queue = new CircularQueue(6);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(11);
        queue.display();
    }
}
