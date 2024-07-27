package Sorting;

public class MaximumchunktomakeSorted {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int count =0;
        int ma = 0;
        for(int i=0;i<n;i++)
        {
            ma = Math.max(ma,arr[i]);
            if(ma==i)
            {
                count = count+1;
            }
        }
        return count;
    }
}
