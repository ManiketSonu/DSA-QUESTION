package Advanced_DSA.Combinatorics;

public class Excel_Number {
    public static void main(String[] args) {
        String s = "BB";
        System.out.println(titleNumber(s));
    }
    public static int titleNumber(String s)
    {
        int ans = 0;
        int mul = 1;
        int n = s.length();
        for(int i=n-1; i>=0; i--)
        {
            ans = ans+mul*(s.charAt(i)-'A'+1);
            mul = mul*26;
        }
        return ans;
    }
}
