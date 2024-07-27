package Advanced_DSA.BinarySearch;

import java.util.Arrays;

public class findSmallestAgaing {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 2};
        int b = 3;
        System.out.println(bthtriplletSum(arr, b));
    }
    public static int bthtriplletSum(int A[], int B)
    {
        int n = A.length;
        Arrays.sort(A);
        int low = 3*A[0];
        int high = 3*A[n-1];
        int result = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(counttriplet(A,mid)>=B)
            {
                result = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return result;
    }
    public static int counttriplet(int arr[], int b)
    {
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int left = i+1;
            int right = n-1;
            while(left<right)
            {
                int sum = arr[i]+arr[left]+arr[right];
                if(sum<=b)
                {
                    count = count+right-left;
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return count;
    }
    // public static int bthtriplletSum(int arr[], int b)
    // {
    //     int tripletSum[] = generatetripletSum(arr);
    //     Arrays.sort(tripletSum);
    //     return tripletSum[b-1];
    // }
    // public static int[] generatetripletSum(int arr[])
    // {
    //     int n = arr.length;
    //     int tripletSum[] = new int[n*(n-1)*(n-2)/6];
    //     int index = 0;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             for(int k=j+1;k<n;k++)
    //             {
    //                 tripletSum[index++] = arr[i]+arr[j]+arr[k];
    //             }
    //         }
    //     }
    //     return tripletSum;
    // }
}
