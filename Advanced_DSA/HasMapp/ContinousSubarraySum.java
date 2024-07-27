package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class ContinousSubarraySum {
    public static void main(String[] args) {
        int arr[] = {5,0,0,0};
        int k = 3;
        System.out.println(checkSubArraySum(arr, k));
    }
    public static boolean checkSubArraySum(int arr[], int k)
    {
        int n = arr.length;
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0, -1);
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+arr[i];
            if(k!=0)
            {
                sum = sum%k;
            }
            if(hs.containsKey(sum))
            {
                if(i-hs.get(sum)>=2)
                {
                    return true;
                }
            }
            else
            {
                hs.put(sum, i);
            }
        }
        return false;
    }
}
