package Advanced_DSA.ModularArithmetic;

public class count_pair {
    public static void main(String[] args) {
        int arr[] = {4,3,6,3,8,12};
        System.out.println(CountPair(arr, 6));
    }
    public static int CountPair(int arr[], int m) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j && (arr[i] % m + arr[j] % m) % m == 0) {
                    count++;
                }
            }
        }
        return count/2;
    }
    // public static int CountPair(int arr[], int m)
    // {
        // int n=arr.length;
        // int count=0;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(((arr[i] % m) + (arr[j] % m)) % m == 0)
        //         {
        //             count++;
        //         }
        //     }
        // }
        
    // }
}
