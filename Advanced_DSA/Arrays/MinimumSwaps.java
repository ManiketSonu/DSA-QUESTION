package Advanced_DSA.Arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        int arr[] = {52,7,93,47,68,26,51,44,5,41,88,19,78,38,17,13,24,74,92,5,84,27,48,49,37,59,3,56,79,26,55,60,16,83,63,40,55,9,96,29,7,22,27,74,78,38,11,65,29,52,36,21,94,46,52,47,87,33,87,70};
        System.out.println(CountSwaps(arr, 19));
    }
    public static int CountSwaps(int arr[], int b)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=b)
            {
                count++;
            }
        }
        int windowCount=0;
        for(int i=0;i<count;i++)
        {
            if(arr[i]<=b)
            {
                windowCount++;
            }
        }
        int minSwaps = count-windowCount;
        for(int i=count;i<n;i++)
        {
            if(arr[i-count]<=b)
            {
                windowCount--;
            }
            if(arr[i]<=b)
            {
                windowCount++;
            }
           minSwaps = Math.min(minSwaps, count-windowCount);
        }
        return minSwaps;
    }
}
