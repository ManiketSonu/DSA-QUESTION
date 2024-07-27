package Advanced_DSA.HasMapp;

// import java.util.HashSet;

public class CountSubArraySumtoZero {
    public static void main(String[] args) {
        int arr[] = {-1, 2, -1};
        System.out.println(CountZero(arr));
    }
    public static int CountZero(int arr[])
    {
        int n = arr.length;
        int pf[] = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        // HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (pf[i] == 0) {
                count++;
            }
            for (int j = 0; j < i; j++) {
                if (pf[i] == pf[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
