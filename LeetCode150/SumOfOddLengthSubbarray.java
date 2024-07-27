package LeetCode150;

public class SumOfOddLengthSubbarray {
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3};
        System.out.print(OddlengthSubArraySum(arr));
    }
    public static int OddlengthSubArraySum(int arr[])
    {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        int sum = 0;
        for (int len = 1; len <= n; len += 2) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                sum += prefixSum[j + 1] - prefixSum[i];
            }
        }
        return sum;
    }
}
