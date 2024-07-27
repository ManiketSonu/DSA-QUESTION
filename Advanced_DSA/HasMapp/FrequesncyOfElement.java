package Advanced_DSA.HasMapp;

// import java.util.HashMap;

public class FrequesncyOfElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 1};
        int arr1[] = {1, 2};
        int res[] = Felement(arr, arr1);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] Felement(int arr[], int arr1[])
    {
        int n = arr.length;
        int m = arr1.length;
        int res[] = new int[m];
        for(int i=0;i<m;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr1[j])
                {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
    // public static int[] Felement(int arr[], int q[])
    // {
    //     int n = arr.length;
    //     int f[] = new int[q.length];
    //     HashMap<Integer, Integer> hs = new HashMap<>();
    //     for(int i=0;i<n;i++)
    //     {
    //         if(hs.containsKey(arr[i]))
    //         {   
    //             int count = hs.get(arr[i]);
    //             hs.put(arr[i], count+1);
    //         }
    //         else
    //         {
    //             hs.put(arr[i], 1);
    //         }
    //     }
    //     for(int i=0;i<q.length;i++)
    //     {
    //         if(hs.containsKey(q[i]))
    //         {
    //             f[i] = hs.get(q[i]);
    //         }
    //         else
    //         {
    //             f[i] = 0;
    //         }
    //     }
    //     return f; 
    // }
}
