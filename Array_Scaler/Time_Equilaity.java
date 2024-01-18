package Array_Scaler;

public class Time_Equilaity {
    public static void main(String arg[]){
        int arr[] = {2, 4, 1, 3, 2};
        int total=0;
        int maxValu = TimeEquality(arr);
        for(int i=0;i<arr.length;i++)
        {
            total=total+(maxValu-arr[i]);
        }
        System.out.println(total);
    }
    public static int TimeEquality(int arr[])
    {
        int n=arr.length;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
