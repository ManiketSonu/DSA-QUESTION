package LeetCode150;

public class MinimumAvereagediff {
    public static void main(String[] args) {
        int arr[] = {2,5,3,9,5,3};
        System.out.println(solve(arr));
    }
    public static int solve(int nums[])
    {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];

        // Calculate prefix sums
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        int minIndex = -1;
        int minDiff = Integer.MAX_VALUE;

        // Iterate over each index
        for (int i = 0; i < n; i++) {
            int leftSum = prefixSum[i];
            int rightSum = prefixSum[n] - prefixSum[i];
            int leftCount = i + 1;
            int rightCount = n - leftCount;

            // Calculate averages and find the minimum difference
            int leftAvg = leftSum / leftCount;
            int rightAvg = rightSum / rightCount;
            int diff = Math.abs(leftAvg - rightAvg);

            if (diff < minDiff || (diff == minDiff && i < minIndex)) {
                minDiff = diff;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
