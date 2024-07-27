package Advanced_DSA.Recursion.StriverSeries;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        // Reve(0, arr.length-1, arr);
        Reve(0, arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Reve(int l, int arr[])
    {
        // if(l>=r)
        // {
        //     return;
        // }
        // int temp = arr[l];
        // arr[l] = arr[r];
        // arr[r] = temp;
        // Reve(l+1, r-1, arr);
           int n = arr.length;
           if(l>=n/2)
           {
            return;
           }
           int temp = arr[l];
           arr[l] = arr[n-l-1];
           arr[n-l-1] = temp;
           Reve(l+1, arr);
    }
}
