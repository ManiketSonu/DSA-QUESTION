package Array_Scaler;

public class Generate_All_SubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       GenerateSubAray(arr);
        
    }
    public static void GenerateSubAray(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
