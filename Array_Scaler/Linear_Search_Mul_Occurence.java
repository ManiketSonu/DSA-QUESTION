package Array_Scaler;

public class Linear_Search_Mul_Occurence {
    public static void main(String arg[])
    {
        int arr[] = {1, 2, 2};
        System.out.println(MulOccurence(arr, 2));
    }
    public static int MulOccurence(int arr[], int B)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==B)
            {
                return 1;
            }
        }
        return 0;
    }
}
