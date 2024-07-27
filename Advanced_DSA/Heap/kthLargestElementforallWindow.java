package Advanced_DSA.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthLargestElementforallWindow {
    public static void main(String[] args) {
        int[] B = {1, 2, 3, 4, 5, 6};
        int A = 4;

        int res[] = solve(A, B);
        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int A, int[] B) 
    {
        int n = B.length;
        int[] result = new int[n];

        // Create a max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Iterate through each subarray [1 : i]
        for (int i = 0; i < n; i++) {
            // Add elements to the max heap
            maxHeap.offer(B[i]);
            
            // If the number of elements in the heap is less than A, set result to -1
            if (maxHeap.size() < A) {
                result[i] = -1;
            } 
            // Otherwise, find the Ath largest element and store it in the result
            else {
                PriorityQueue<Integer> tempHeap = new PriorityQueue<>(maxHeap);
                for (int j = 0; j < A - 1; j++) {
                    tempHeap.poll();
                }
                result[i] = tempHeap.peek();
            }
        }
        return result;
    }
}
