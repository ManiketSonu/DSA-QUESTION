package Advanced_DSA.Combinatorics;

public class Sorted_Permutation_Rank {
    public static void main(String[] args) {
        String A = "acb";
        System.out.println(findRank(A));
    }
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return (n*fact(n-1));
        }
    }
    public static int findRank(String A)
    {
        // String s = A;
        int ans = 0;
        int n = A.length();
        for(int i=0;i<n-1;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(A.charAt(j)<A.charAt(i))
                {
                    count++;
                }
                
            }
            ans  = ans+(count*fact(n-i-1));
        }
        return ans+1;
    }
}
