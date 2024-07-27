package Advanced_DSA.ModularArithmetic;

public class Pair_Sum {
    public static void main(String[] args) {
        int arr[] = {5, 17, 100, 11};
        int B = 28;
        System.out.println(Solve(arr, B));
    }
    public static int Solve(int arr[], int B) {
        int n = arr.length;
        int count[] = new int[B];
        int mod = 1000000007;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            count[arr[i] % B]++;
        }
        ans = (count[0] * (count[0] - 1)) / 2;
        ans %= mod;
        int i = 1;
        int j = B - 1;
        while (i <= j) {
            if (i == j) {
                ans += (count[i] * (count[j] - 1)) / 2;
                ans %= mod;
            } else {
                ans += count[i] * count[j];
                ans %= mod;
            }
            i++;
            j--;
        }
        return (int)ans;
    }
    // public static int Solve(int arr[], int B)
    // {
    //     int n = arr.length;
    //     int count=0;
    //     for(int i=0;i<n-1;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(((arr[i]+arr[j])%B)==0)
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
}
