package Advanced_DSA.BinarySearch;

import java.util.Arrays;

public class AddOrNot {
    public static void main(String[] args) {
        int arr[] = {-5, 6, 1, -5, 1, -3, 1, 3, 1, 5};
        // int arr[] = {5,5,5};
        int B = 9;
        int result[] = solve(arr, B);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] solve(int A[], int B) 
    {
        Arrays.sort(A); // Sort the array
        int n = A.length;
        int low = A[0], high = A[n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = countOccurrences(A, mid);

            if (cnt <= B) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        // Adjust the maximum occurring number with remaining operations
        int maxOccurringNumber = low - 1;
        int maxFrequency = countOccurrences(A, low - 1);

        // Handle edge cases when the last element is the maximum occurring number
        if (countOccurrences(A, high) > maxFrequency && B > 0) {
            maxOccurringNumber = high;
            maxFrequency = countOccurrences(A, high);
        }

        return new int[]{maxFrequency, maxOccurringNumber};
    }
    public static int countOccurrences(int[] A, int num) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= num) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    // public static int[] solve(int A[], int B)
    // {
    //     int n = A.length;
    //     Arrays.sort(A);
    //     int ans[] = new int[2];
    //     ans[0] = -1;
    //     ans[1] = -1;

    //     boolean allequal = true;
    //     for(int i=1;i<n;i++)
    //     {
    //         if(A[i]!=A[i-1])
    //         {
    //             allequal = false;
    //             break;
    //         }
    //     }
    //     if(allequal)
    //     {
    //         ans[0] = n;
    //         ans[1] = A[0];
    //         return ans;
    //     }

    //     for(int i=0;i<n-1;i++)
    //     {
    //         int count = 0;
    //         int opreation = B;
    //         for(int j=i;j>=0;j--)
    //         {
    //             if(A[i]-A[j]<=opreation)
    //             {
    //                 opreation -= A[i]-A[j];
    //                 count++;
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //         if(ans[0]<count)
    //         {
    //             ans[0] = count;
    //             ans[1] = A[i];
    //         }
    //     }
    //     return ans;
    // }
}
