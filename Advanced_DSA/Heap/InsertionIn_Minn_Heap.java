package Advanced_DSA.Heap;

import java.util.PriorityQueue;

public class InsertionIn_Minn_Heap {
    public static void main(String[] args) {
        // InsertionIn_Minn_Heap maxHeap = new InsertionIn_Minn_Heap(10);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(5);
        minHeap.offer(12);
        minHeap.offer(20);
        minHeap.offer(25);
        minHeap.offer(13);
        minHeap.offer(24);
        minHeap.offer(22);
        minHeap.offer(35);

        System.out.println("Min heap before insertion:");
        System.out.println(minHeap);

        // Insert an element into the min heap
        minHeap.offer(10);

        System.out.println("Min heap after insertion:");
        System.out.println(minHeap);
    }
    // private int[] heap;
    // private int size;
    // private int capacity;
    // public InsertionIn_Minn_Heap(int capacity)
    // {
    //     this.capacity = capacity;
    //     heap = new int[capacity];
    //     size = 0;
    // }
    // public int parent(int pos)
    // {
    //     return (pos-1)/2;
    // }
    // public int leftChild(int pos)
    // {
    //     return 2*pos+1;
    // }
    // public int rightChild(int pos)
    // {
    //     return 2*pos+2;
    // }
    // public void swap(int pos1, int pos2)
    // {
    //     int temp = heap[pos1];
    //     heap[pos1] = heap[pos2];
    //     heap[pos2] = temp;
    // }
    // public void insert(int value)
    // {
    //     if(size>=capacity)
    //     {
    //         return;
    //     }
    //     heap[size] = value;
    //     int currentIndex = size;
    //     size++;
    //     while(currentIndex>0 && heap[currentIndex]<heap[parent(currentIndex)])
    //     {
    //         swap(currentIndex, parent(currentIndex));
    //         currentIndex = parent(currentIndex);
    //     }
    // }
    // public void printheap()
    // {
    //     for(int i=0;i<size;i++)
    //     {
    //         System.out.print(heap[i]+" ");
    //     }
    //     System.out.println();
    // }
}
