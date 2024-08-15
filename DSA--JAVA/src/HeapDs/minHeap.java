package HeapDs;

public class minHeap {
    private int[] heap;
    private int size;
    private final int capacity;

    public minHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int index){
        return (index -1)/2;
    }

    private int leftChild(int index){
        return 2 * index + 1;
    }

    private int rightChild(int index){
        return 2 * index + 2;
    }

    private void swap(int index1,int index2){
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public void insert(int value){
        if(size == capacity){
            throw new RuntimeException("Heap is full");
        }

        heap[size] = value;
        size++;
        int current = size -1;

        while(current != 0 && heap[parent(current)] > heap[current]){
            swap(current,parent(current));
            current = parent(current);
        }

    }

    public int extractMin(){
        if(size <= 0){
            throw new RuntimeException("Heap is empty");

        }

        if(size ==1){
            size--;
            return heap[0];
        }

        int root = heap[0];
        heap[0] = heap[size-1];
        size--;
        minHeapify(0);

        return root;
    }

    private void minHeapify(int index){
        int left = leftChild(index);
        int right = rightChild(index);
        int smallest = index;

        if(left < size && heap[left] < heap[smallest]){
            smallest = left;
        }

        if(right < size && heap[right] < heap[smallest]){
            smallest = right;
        }

        if(smallest != index){
            swap(index,smallest);
            minHeapify(smallest);
        }

    }

    public static void main(String[] args) {
        minHeap min = new minHeap(10);
        min.insert(3);
        min.insert(2);
        min.insert(1);
        min.insert(7);
        min.insert(8);
        min.insert(4);
        min.insert(10);
        min.insert(16);
        min.insert(12);

        System.out.println("Extracted Min: " + min.extractMin());
    }
}
