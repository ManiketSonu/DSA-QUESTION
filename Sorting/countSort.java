package Sorting;

public class countSort {
    public static void main(String[] args) {
        int arr[] = {6,3,4,2,7,2,1,0,5,0,1};
        int res[] = countsortin(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] countsortin(int arr[])
    {
        int n = arr.length;
        int count[] = new int[10];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        int k = 0;
        for(int i=0;i<10;i++)
        {
            for(int j=1;j<=count[i];j++)
            {
                arr[k] = i;
                k++;
            }
        }
        return count;
    }
}
