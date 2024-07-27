package Advanced_DSA.TwoPointer;

import java.util.Arrays;

public class  Pairs_with_Given_Difference {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        int B = 1;
        System.out.println(solve(arr, B));
    }
    public static int solve(int arr[], int B) {
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = 1;
        int ans = 0;

        while (j < n) {
            if (arr[j] - arr[i] < B) {
                j++;
            } else if (arr[j] - arr[i] == B) {
                ans++;
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
                while (j < n - 1 && arr[j] == arr[j + 1]) {
                    j++;
                }
                i++; 
                j++;
            } else { 
                i++; 
                if (i == j) {
                    j++; 
                }
            }
        }
        return ans;
    }
    // public static int solve(int arr[], int B)
    // {
    //     Arrays.sort(arr);
    //     int n = arr.length;
    //     int i = 0;
    //     int j = 1;
    //     int ans = 0;
    //     while (j < n) {
    //         if (arr[j] - arr[i] < B) {
    //             j++;
    //         } else if (arr[j] - arr[i] == B) {
    //             ans++;
    //             i++;
    //             j++;
    //         } else if (arr[j] - arr[i] > B) {
    //             i++;
    //             if (i == j) {
    //                 j++;
    //             }
    //         }
    //     }
    //     return ans;
    // }
}
