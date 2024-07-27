package Sorting;

public class Partition {
    public static void main(String[] args) {
        int arr[] = {6,5,9,8,2,0,16,11,12};
        System.out.println(partion(arr));
    }
    public static int partion(int arr[])
    {
        int n = arr.length;
        int pivot = arr[0];
        int p1 = 1;
        int p2 = n-1;
        while(p1<=p2)
        {
            if(arr[p1]<=pivot)
            {
                p1++;
            }
            else if(arr[p2]>pivot)
            {
                p2--;
            }
            else
            {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
            int temp = arr[0];
            arr[0] = arr[p2];
            arr[p2] = temp;
        }
        return p2;
    }
}
