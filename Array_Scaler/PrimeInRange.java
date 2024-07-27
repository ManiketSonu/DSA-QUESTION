package Array_Scaler;

public class PrimeInRange {
    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        int result[] = PrintInR(A, B);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] PrintInR(int A, int B)
    {
        int count = 0;
        for(int i=A;i<=B;i++)
        {
            if(checkPrime(i))
            {
                count++;
            }
        }
        int res[] = new int[count];
        int ans = 0;
        for(int i=A;i<=B;i++)
        {
            if(checkPrime(i))
            {   
                res[ans] = i;
                ans++;
            }
        }
        return res;
    }
    public static boolean checkPrime(int A)
    {
        if(A==0||A==1)
        {
            return false;
        }
        for(int i=2;i*i<=A;i++)
        {
            if(A%2==0)
            {
                return false;
            }
        }
        return true;
    }
}
