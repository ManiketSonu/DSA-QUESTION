package Advanced_DSA.HasMapp;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementWindow {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 3};
        int k = 3;
        int res[] = solve(arr, k);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]+" ");
        }
    }
    public static int [] solve(int A[], int B)
    {
        int n = A.length;
        if (B > n)
            return new int[0]; // Return an empty array if window size is larger than array size
        
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Count distinct elements in the first window
        for (int i = 0; i < B; i++) {
            countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);
        }
        
        result.add(countMap.size()); // Add distinct count for the first window
        
        // Slide the window and update distinct count
        for (int i = 1; i <= n - B; i++) {
            int left = A[i - 1];
            int right = A[i + B - 1];
            
            // Remove the element going out of the window
            countMap.put(left, countMap.get(left) - 1);
            if (countMap.get(left) == 0) {
                countMap.remove(left);
            }
            
            // Add the element entering the window
            countMap.put(right, countMap.getOrDefault(right, 0) + 1);
            
            result.add(countMap.size()); // Add distinct count for the current window
        }
        
        // Convert ArrayList to int array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
    // public static int DistinctElementWindowCount(int arr[], int k)
    // {
    //     int n = arr.length;
    //     HashMap<Integer, Integer> hs = new HashMap<>();
    //     int distinctCount = 0;

    //     // Count distinct elements in the first window
    //     for (int i = 0; i < k; i++) {
    //         hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
    //         if (hs.get(arr[i]) == 1) {
    //             distinctCount++;
    //         }
    //     }
    //     System.out.println("Distinct elements count for window [0," + (k - 1) + "]: " + distinctCount);

    //     // Slide the window and update distinct count
    //     for (int i = 1; i <= n - k; i++) {
    //         int left = arr[i - 1];
    //         int right = arr[i + k - 1];

    //         // Remove the element going out of the window
    //         hs.put(left, hs.get(left) - 1);
    //         if (hs.get(left) == 0) {
    //             distinctCount--;
    //         }

    //         // Add the element entering the window
    //         if (!hs.containsKey(right) || hs.get(right) == 0) {
    //             distinctCount++;
    //         }
    //         hs.put(right, hs.getOrDefault(right, 0) + 1);

    //         // Output distinct elements count for the current window
    //         System.out.println("Distinct elements count for window [" + i + "," + (i + k - 1) + "]: " + distinctCount);
    //     }
    //     return distinctCount;
    // }
}
