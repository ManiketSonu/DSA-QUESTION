package LeetCode150;

public class Defuse_Bomb {
    public static void main(String[] args) {
        int arr[] = {5,7,1,4};
        int k = 3;
        int result[] = defeuseBomb(arr, k);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] defeuseBomb(int code[], int k)
    {
        int n = code.length;
        int res[] = new int[n];
        if(k==0)
        {
            return res;
        }
        if(k>0)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=1;j<=k;j++)
                {
                    res[i] = res[i]+code[(i+j)%n];
                }
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                for(int j=1;j<=-1*k;j++)
                {
                    res[i] = res[i]+code[(n+i-j)%n];
                }
            }
        }
        return res;
    }
}
