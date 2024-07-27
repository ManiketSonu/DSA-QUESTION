package Advanced_DSA.Stackk;

public class MaxAndMin {
    public static void main(String[] args) {
        int arr[] = {2,5,3};
        FinAllSubArray(arr);
    }
    public static void FinAllSubArray(int arr[])
    {
        int n = arr.length;
        int len = n*(n+1)/2;
        int res[] = new int[len];
        int index = 0;
        for(int i =0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int k=i;k<=j;k++)
                {
                    if(arr[k]>max)
                    {
                        max = arr[k];
                    }
                    if(arr[k]<min)
                    {
                        min = arr[k];
                    }
                }
                res[index] = max-min;
                index++;
            }
        }
        int sum = 0;
        for(int m=0;m<res.length;m++)
        {
            sum = sum+res[m];
        }
        System.out.println(sum);
    }
}
