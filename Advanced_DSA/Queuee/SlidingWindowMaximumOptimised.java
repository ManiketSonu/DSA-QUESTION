package Advanced_DSA.Queuee;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximumOptimised {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int result[] = solve(arr, k);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] solve(int arr[], int k)
    {
        int n = arr.length;
        if(n == 0 || k > n) 
        {
            return new int[0];
        }

        Deque<Integer> de = new ArrayDeque<>();
        int res[] = new int[n - k + 1];
        int index = 0;
        for(int i = 0; i < k; i++) 
        {
            while(!de.isEmpty() && arr[i] >= arr[de.peekLast()]) 
            {
                de.removeLast();
            }
            de.addLast(i);
        }
        res[index++] = arr[de.peekFirst()];

        for(int i = k; i < n; i++) 
        {
            while(!de.isEmpty() && de.peekFirst() <= i - k) 
            {
                de.removeFirst();
            }
            while(!de.isEmpty() && arr[i] >= arr[de.peekFirst()]) 
            {
                de.removeLast();
            }
            de.addLast(i);
            res[index++] = arr[de.peekFirst()];
        }
        return res;
    }
}
