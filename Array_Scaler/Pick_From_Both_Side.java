package Array_Scaler;

public class Pick_From_Both_Side {
    public static void main(String[] args) {
        int arr[] = {2, 3, -1, 4, 2, 1};
        int B = 4;
        System.out.println(solve(arr, B));
    }
    public static int solve(int arr[], int B)
    {
        int n = arr.length;
        int pf[] = new int[n];
        pf[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            pf[i] = pf[i-1]+arr[i];
        }

        int sf[] = new int[n];
        sf[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sf[i] = sf[i+1]+arr[i];
        }

        // int ans = 0;
        int sum = 0;
        int ans = Math.max(pf[B-1],sf[n-B]);
        for(int i=1;i<B;i++)
        {
            sum = pf[i-1]+sf[n-B+i];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
