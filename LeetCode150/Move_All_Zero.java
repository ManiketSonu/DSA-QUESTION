package LeetCode150;

// import java.util.Arrays;

public class Move_All_Zero {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        MoveZero(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    // public static void MoveZero(int arr[])
    // {
    //     int n=arr.length;
    //     Arrays.sort(arr);
    //     int start=0;
    //     int end=n-1;
    //     while(start<end)
    //     {
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }
    public static void MoveZero(int arr[])
    {
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[res];
                arr[res] = temp;
                res++;
            }
        }
    }
}
