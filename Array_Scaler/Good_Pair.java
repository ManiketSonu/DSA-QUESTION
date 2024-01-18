package Array_Scaler;

public class Good_Pair {
    public static void main(String arg[])
    {
        int arr[] = {1,2,3,4};
        int res=GPair(arr, 7);
        System.out.println(res);
    }
    public static int GPair(int arr[], int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==n)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}
