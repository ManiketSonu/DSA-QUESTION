package Advanced_DSA.ModularArithmetic;

public class Delete_one {
    public static void main(String[] args) {
        int arr[] = {5, 15, 30};
        System.out.println(DeleteOne(arr));
    }
    public static int DeleteOne(int arr[])
    {
        int n = arr.length;
        int pf[] = new int[n];
        pf[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            pf[i] = GCD(pf[i-1],arr[i]);
        }

        int sf[] = new int[n];
        sf[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sf[i] = GCD(sf[i+1], arr[i]);
        }

        int ans = Integer.MIN_VALUE;
        //Remove 0th element
        ans = Math.max(ans, sf[1]);
        //Remove n-1th element
        ans = Math.max(ans, pf[n-2]);

        for(int i=1;i<=n-2;i++)
        {
            ans = Math.max(ans,GCD(pf[i-1],sf[i+1]));
        }
        return ans;
    }
    public static int GCD(int A, int B)
    {
        if(A<0 || B<0)
        {
            return GCD(Math.abs(A), Math.abs(B));
        }
        if(A<B)
        {
            return GCD(B,A);
        }
        if(B==0)
        {
            return A;
        }
        return GCD(B,A%B);
    }
}
