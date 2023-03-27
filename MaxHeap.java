class Heap{
    int[] heap;
    int size;

    public Heap(int capacity){
        heap = new int[capacity];
        size = 0;
    }
    public void insert(int value){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap Overflow");
        }
        heap[size] = value;
        size++;
        heapifyUp(size-1);
    }
    public void heapifyUp(int index){
        int parentIndx = (index) / 2;
        if(parentIndx >= 0 && heap[index] > heap[parentIndx]){
            swap(index, parentIndx);
            heapifyUp(parentIndx);
        }
    }
    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= heap.length;
    }
}

public class MaxHeap {
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.insert(12);
        h.insert(10);
        h.insert(85);
        h.insert(1040);
        h.insert(45);
        h.insert(14700);
        h.insert(1);
        h.insert(78);
        h.insert(98);
        h.insert(9812);
        System.out.print("Max Heap --> ");
        for (int i : h.heap) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Heap Size --> " + h.size);
        // System.out.println(h.isEmpty());
        // System.out.println(h.isFull());
    }
}
