package Interview;

import java.util.Arrays;

public class sortbasedonnumberofSetbit {
    public static void main(String[] args) {
        // int arr[] = {1024,512,256,128,64,32,16,8,4,2,1};
        int arr[] = {0,1,2,3,4,5,6,7,8};
        int result[] = solve(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
    public static int[] solve(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);
        int total = 0;
        int res[] = new int[n];
        for(int i=0;i<16;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(countSetBit(arr[j])==i)
                {
                    res[total] = arr[j];
                    total++;
                }
            }
        }
        return res;
    }
    public static int countSetBit(int n)
    {
        int count = 0;
        while(n>0)
        {
            if((n&1)==1)
            {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
