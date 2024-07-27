package Advanced_DSA.Heap;

import java.util.PriorityQueue;

public class findKthLargestEle {
    public static void main(String[] args) {
        int k = 3;
        int kthSmallest = runMinHeapExample(k);
        System.out.println(kthSmallest);
    }
    public static int runMinHeapExample(int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(10);
        minHeap.offer(8);
        minHeap.offer(7);
        minHeap.offer(5);
        minHeap.offer(16);
        minHeap.offer(19);
        minHeap.offer(3);

        System.out.println("Min heap before insertion:");
        System.out.println(minHeap);

        // Find the kth smallest element
        int kthSmallest = findKthSmallest(minHeap, k);

        return kthSmallest;
    }
    private static int findKthSmallest(PriorityQueue<Integer> minHeap, int k) {
        for(int i=0;i<k-1;i++)
        {
            minHeap.poll();
        }
        return minHeap.peek();
    }  
}
