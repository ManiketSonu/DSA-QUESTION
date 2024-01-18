package Advanced_DSA.Arrays;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int arr[] = {2,1,3,2,4};
        System.out.println(RainWater(arr));
    }
    public static int RainWater(int arr[])
    {
        int n=arr.length;
        int pf[] = new int[n];
        pf[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            pf[i] = Math.max(pf[i-1], arr[i]);
        }
        
        int sf[] = new int[n];
        sf[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sf[i] = Math.max(sf[i+1], arr[i]);
        }

        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans = ans+Math.min(sf[i], pf[i])-arr[i];
        }
        return ans;
    }
}
