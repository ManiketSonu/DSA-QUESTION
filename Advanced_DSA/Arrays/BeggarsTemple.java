package Advanced_DSA.Arrays;

public class BeggarsTemple {
    public static void main(String[] args) {
        // int arr[] = {};
    }
    public static int cout(int arr[], int b)
    {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= b) {
                count++;
            }
        }
        int currentCount = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] <= b) {
                currentCount++;
            }
        }
        int minSwaps = count - currentCount;
        for (int i = count; i < n; i++) {
            if (arr[i - count] <= b) {
                currentCount--;
            }
            if (arr[i] <= b) {
                currentCount++;
            }
            minSwaps = Math.min(minSwaps, count - currentCount);
        }
        return minSwaps;
    }
}
