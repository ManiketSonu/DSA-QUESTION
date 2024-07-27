package Advanced_DSA.Heap;

import java.util.PriorityQueue;

public class ExtractMinnInMinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(5);
        minHeap.offer(12);
        minHeap.offer(20);
        minHeap.offer(25);
        minHeap.offer(13);
        minHeap.offer(24);
        minHeap.offer(22);
        minHeap.offer(35);

        System.out.println("Max heap before extraction:");
        System.out.print(minHeap+" ");

        // Extract the minimum element
        int min = minHeap.poll();
        System.out.println("Extracted minimum element from heap: " + min);

        System.out.println("Min heap after extraction:");
        System.out.println(minHeap);
    }
//     private int[] heap;
//     private int size;
//     private int capacity;
//     public ExtractMinnInMinHeap(int capacity)
//     {
//         this.capacity = capacity;
//         heap = new int[capacity];
//         size = 0;
//     }
//     public int parent(int pos)
//     {
//         return (pos-1)/2;
//     }
//     public int leftChild(int pos)
//     {
//         return 2*pos+1;
//     }
//     public int rightChild(int pos)
//     {
//         return 2*pos+2;
//     }
//     public void swap(int pos1, int pos2)
//     {
//         int temp = heap[pos1];
//         heap[pos1] = heap[pos2];
//         heap[pos2] = temp;
//     }
//     public void insert(int value)
//     {
//         if(size>=capacity)
//         {
//             return;
//         }
//         heap[size] = value;
//         int currentIndex = size;
//         size++;
//         while(currentIndex>0 && heap[currentIndex]>heap[parent(currentIndex)])
//         {
//             swap(currentIndex, parent(currentIndex));
//             currentIndex = parent(currentIndex);
//         }
//     }
//     public int extractMin() 
//     {
//         if (size == 0) 
//         {
//             System.out.println("Heap is empty.");
//             return -1; // Or throw an exception
//         }

//         int min = heap[0];
//         heap[0] = heap[size - 1];
//         size--;

//         heapify(0);

//         return min;
//     }
//     private void heapify(int index) 
//     {
//         int largest = index;
//         int left = leftChild(index);
//         int right = rightChild(index);

//         if (left < size && heap[left] > heap[largest]) 
//         {
//             largest = left;
//         }

//         if (right < size && heap[right] > heap[largest]) 
//         {
//             largest = right;
//         }

//         if (largest != index) 
//         {
//             swap(index, largest);
//             heapify(largest);
//         }
//     }
//     public void printheap()
//     {
//         for(int i=0;i<size;i++)
//         {
//             System.out.print(heap[i]+" ");
//         }
//         System.out.println();
//     }
}
