package Array_Scaler;

public class ReaarangePositiveNegative {
    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int res[] = solve(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        int negativeIndex = 0;
        int positiveIndex = n - 1;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                ans[negativeIndex] = arr[i];
                negativeIndex++;
            }
        }
        for(int i = n-1; i >= 0; i--) {
            if(arr[i] >= 0) {
                ans[positiveIndex] = arr[i];
                positiveIndex--;
            }
        }
        return ans;
    }
}
