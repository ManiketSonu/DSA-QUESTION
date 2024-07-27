package Advanced_DSA.Greddy;

public class CadyMinimum {
    public static void main(String[] args) {
        int arr[] = {6,1,2,0,5,8,10,6,4,1,2};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int result[] = new int[n];
        for(int i=0;i<n;i++)
        {
            result[i] = 1;
        }

        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                result[i] = result[i-1]+1;
            }
        }

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                result[i] = Math.max(result[i], result[i+1]+1);
            }
        }

        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+result[i];
        }
        return sum;
    }
}
