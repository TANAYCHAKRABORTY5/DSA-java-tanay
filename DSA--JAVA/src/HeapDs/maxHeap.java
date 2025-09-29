package HeapDs;

public class maxHeap {
    private int[] heap;
    private int size;
    private final int capacity;

    public maxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new RuntimeException("Heap is full");
        }
        heap[size] = value;
        size++;
        int current = size - 1;

        while (current != 0 && heap[parent(current)] < heap[current]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMax() {
        if (size <= 0) {
            throw new RuntimeException("Heap is empty");
        }
        if (size == 1) {
            size--;
            return heap[0];
        }

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        maxHeapify(0);

        return root;
    }

    private void maxHeapify(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            maxHeapify(largest);
        }
    }

    public static void main(String[] args) {
        maxHeap maxHeap = new maxHeap(10);
        maxHeap.insert(3);
        maxHeap.insert(2);
        maxHeap.insert(1);
        maxHeap.insert(7);
        maxHeap.insert(8);
        maxHeap.insert(4);
        maxHeap.insert(10);
        maxHeap.insert(16);
        maxHeap.insert(12);

        System.out.println("Extracted Max: " + maxHeap.extractMax());
    }
}
