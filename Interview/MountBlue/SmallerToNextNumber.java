package Interview.MountBlue;

import java.util.ArrayList;

public class SmallerToNextNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,5,4,7,6};
        int res[] = solve(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int arr[])
    {
        int n = arr.length;
        if(n==0 || n==1)
        {
            return arr;
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                arr[i] = arr[i]+arr[i+1];
                arr[i+1] = Integer.MAX_VALUE;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=Integer.MAX_VALUE)
            {
                list.add(arr[i]);
            } 
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
