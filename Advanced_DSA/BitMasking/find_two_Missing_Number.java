package Advanced_DSA.BitMasking;

public class find_two_Missing_Number {
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int result[] = findtwomissingNumber(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]);
        }
    }
    public static int[] findtwomissingNumber(int arr[])
    {
        int n=arr.length;
        int totalxor = 0;
        for(int i=0;i<n;i++)
        {
            totalxor = totalxor^(i+1)^arr[i];
        }
        int expectedxor = 0;
        for(int i=1;i<=n+2;i++)
        {
            expectedxor = expectedxor^i;
        }
        int combinedXor = totalxor^expectedxor;
        int rightmostsetbit = combinedXor & -combinedXor;
        int missingno1 = 0;
        int missingno2 = 0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]&rightmostsetbit)==0)
            {
                missingno1 = missingno1^arr[i];
            }
            else
            {
                missingno2  = missingno2^arr[i];
            }
        }
        for(int i=0;i<=n+2;i++)
        {
            if((i&rightmostsetbit)==0)
            {
                missingno1 = missingno1^i;
            }
            else
            {
                missingno2 = missingno2^i;
            }
        }
        int[] result = {Math.min(missingno1, missingno2), Math.max(missingno1, missingno2)};
        return result;
    }
}
