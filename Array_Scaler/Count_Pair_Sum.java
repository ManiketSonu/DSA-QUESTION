package Array_Scaler;

public class Count_Pair_Sum {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 3, 5, 8};
        System.out.println(PairSum(arr1, arr2, 10));
    }
    public static int PairSum(int arr1[], int arr2[], int x)
    {
        // int count=0;
        // int n=arr1.length;
        // int m=arr2.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         if(arr1[i]+arr2[j]==x)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        int n = arr1.length;
        int m = arr2.length;
        int count = 0;
        int i = 0;
        int j = m-1;
        while(i<n && j>0){
            int sum = arr1[i] + arr2[j];
            if(sum==x){
                count++;
                i++;
                j--;
            }else if(sum<x){
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
}
