package LeetCode150;

public class Find_Smallest_Greater {
    public static void main(String[] args) {
        char arr[] = {'c', 'f', 'j'};
        char target = 'a';
        int result = SmallestGreater(arr, target);
        System.out.println("Smallest greater element: " + arr[result]);
    }
    public static int SmallestGreater(char arr[], char target)
    {
        int low = 0;
        int high = arr.length - 1;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}
