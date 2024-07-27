package Advanced_DSA.BinarySearch;

public class SpecialInteger {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int b = 10;
        System.out.println(solve(arr, b));
    }
    public static boolean isValid(int[] A, int B, int K) {
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (i >= K) {
                sum -= A[i - K];
            }
            sum += A[i];
            if (sum > B) {
                return false;
            }
        }
        return true;
    }
    public static int solve(int A[], int B)
    {
        int low = 1;
        int high = A.length;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(A, B, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
