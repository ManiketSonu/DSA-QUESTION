package Advanced_DSA.TwoPointer;

public class DuplicatesZero {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        solve(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void solve(int arr[])
    {
        int n = arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]==0)
            {
                for(int j=n-1;j>i;j--)
                {
                    arr[j] = arr[j-1];
                }
                i++;
            }
            i++;
        }
    }
}
