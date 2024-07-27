package Advanced_DSA.Recursion;

public class Implement_Power_Function {
    public static void main(String[] args) {
        System.out.println(pow(2, 3, 3));
    }
    public static int pow(int A, int B, int C)
    {
        if(A==0)
        {
            return 0;
        }
        if(B==0)
        {
            return 1%C;
        }
        long ans = power(A, B/2, C);
        ans = (ans*ans)%C;
        if(B%2==1)
        {
            ans = (ans*A)%C;
        }
        ans = (ans+C)%C;
        return (int)ans;
    }
    private static long power(int A, int B, int C) {
        if(A==0)
        {
            return 0;
        }
        if(B==0)
        {
            return 1%C;
        }
        long ans = power(A, B/2,C);
        ans = (ans*ans)%C;
        if (B % 2 == 1) {
            ans = (ans * A) % C;
        }
        return ans;
    }
}
