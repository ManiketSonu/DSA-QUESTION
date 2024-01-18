package Array_Scaler;

public class Range_Sum_Querry {
    public static void main(String[] args) {
        int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
        int left[] = {1,1,2,0};
        int right[] = {2,3,5,5};
        int res[] = solve(arr, left, right, 4);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    public static int[] prefixSum(int arr[])
    {
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
             pf[i]=pf[i-1]+arr[i];
        }
        return pf;
    }
    public static int[] solve(int arr[], int l[], int r[], int q)
    {
        //int sum=0;
        int res[] = prefixSum(arr);
        int[] res1 = new int[q];
        for(int i=0;i<q;i++)
        {
            int left = l[i];
            int right = r[i];
            int sum=0;
            if(left==0)
            {
                sum = res[right];
            }
            else
            {
                sum = res[left-1]+res[right];
            }
            res1[i] = sum;
        }
        return res1;
    }
}
