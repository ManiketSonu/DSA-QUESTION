package Advanced_DSA.BinarySearch;

public class AthMagicalNUmber {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        System.out.println(Magicalnumber(A, B, C));
    }
    public static int count(int A, int B, int C)
    {
        int divByB = A / B;
        int divByC = A / C;
        int divByLCM = A / lcm(B, C);
        return divByB + divByC - divByLCM;
    }
    public static int lcm(int b, int c) {
        return b*c/gcd(b,c);
    }
    public static int gcd(int b, int c)
    {
        while(c!=0)
        {
            int temp = b;
            b=c;
            c=temp%c;
        }
        return b;
    }
    public static int Magicalnumber(int A, int B, int C)
    {
        int low = 1;
        int high = A*Math.min(B,C);
        int ans = 0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(count(mid, B, C)>A)
            {
                high = mid-1;
            }
            else if(count(mid, B, C)<A)
            {
                low = mid+1;
            }
            else
            {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}
