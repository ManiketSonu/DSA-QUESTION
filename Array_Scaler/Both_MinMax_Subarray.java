package Array_Scaler;

public class Both_MinMax_Subarray {
    public static void main(String[] args) {
        int arr[] = {1,3,0,4,2,7,0,8,0,0,9};
        int result = minimumSubArrayLength(arr);
        System.out.println(result);
    }
    // public static int minSubarrayLength(int[] arr) {
    //     int n = arr.length;
    //     int[] maxIndex = getMaxIndexArray(arr);
    //     int[] minIndex = getMinIndexArray(arr);
    //     int minLength = Integer.MAX_VALUE;
    //     for (int i = 0; i < n; i++) {
    //         int currentLength = maxIndex[i] - minIndex[i] + 1;
    //         minLength = Math.min(minLength, currentLength);
    //     }
    //     return minLength;
    // }
    // private static int[] getMaxIndexArray(int[] arr) {
    //     int n = arr.length;
    //     int[] maxIndex = new int[n];
    //     int maxIdx = n - 1;
    //     for (int i = n - 1; i >= 0; i--) {
    //         if (arr[i] > arr[maxIdx]) {
    //             maxIdx = i;
    //         }
    //         maxIndex[i] = maxIdx;
    //     }
    //     return maxIndex;
    // }
    // private static int[] getMinIndexArray(int[] arr) {
    //     int n = arr.length;
    //     int[] minIndex = new int[n];
    //     int minIdx = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] < arr[minIdx]) {
    //             minIdx = i;
    //         }
    //         minIndex[i] = minIdx;
    //     }
    //     return minIndex;
    // }
        public static int minimumSubArrayLength(int arr[])
        {
            int n=arr.length;
            int maxValue = largest(arr);
            int minValue = samllest(arr);
            int minLength = Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                int currentLength = (maxValue-minValue)+1;
                minLength = Math.min(minLength, currentLength);
            }
            return minLength;
        }
        public static int largest(int arr[])
        {
            int n=arr.length;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                }
            }
            return max;
        }
        public static int samllest(int arr[])
        {
            int n=arr.length;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                if(min>arr[i])
                {
                    min=arr[i];
                }
            }
            return min;
        }
}
