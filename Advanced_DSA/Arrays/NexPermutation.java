package Advanced_DSA.Arrays;

import java.util.Arrays;

public class NexPermutation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        // int res[] = nextPer(arr);
        // for(int i=0;i<res.length;i++)
        // {
        //     System.out.println(res[i]+" ");
        // }
        nextPer(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void reverse(int arr[], int l, int r)
    {
        while(l<r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static int[] nextPer(int arr[])
    {
        int n=arr.length;
        int index = -1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            reverse(arr,0,n-1);
        }
        else
        {
            for(int i=n-1;i>=index;i--)
            {
                if(arr[i]>arr[index])
                {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }
            reverse(arr,index+1,n-1);
        }
        return arr;
    }
}
