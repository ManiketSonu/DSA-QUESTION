package Sorting;

public class countSort1 {
    public static void main(String[] args) {
        int arr[] = {4,3,1,5,3,1,3,5};
        int res[] = coutnSortt(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    private static int findMaxElement(int[] arr) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>mx)
            {
                mx = arr[i];
            }
        }
        return mx;
    }
    public static int[] coutnSortt(int arr[])
    {
        int n = arr.length;
        int max = findMaxElement(arr);
        int count[] = new int[max+1];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        int k = 0;
        for(int i=0;i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                arr[k] = i;
                k++;
            }
        }
        return arr;
    }
}
