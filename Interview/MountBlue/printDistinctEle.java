package Interview.MountBlue;

import java.util.HashSet;

public class printDistinctEle {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3, 5};
        int k = 4;
        printDEle(arr, k);
    }
    public static void printDEle(int arr[], int k)
    {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<k && i<n;i++)
        {
            hs.add(arr[i]);
        }

        printSet(hs);
        for(int i=k;i<n;i++)
        {
            hs.remove(arr[i-k]);
            hs.add(arr[i]);
            printSet(hs);
        }
    }
    public static void printSet(HashSet<Integer> set)
    {
        for(Integer num : set)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
