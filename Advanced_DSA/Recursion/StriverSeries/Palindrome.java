package Advanced_DSA.Recursion.StriverSeries;

public class Palindrome {
    public static void main(String[] args) {
        String s = "MADAM";
        System.out.println(Palind(0, s));
    }
    public static boolean Palind(int i, String s)
    {
        int n = s.length();
        if(i>=n/2)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1))
        {
            return false;
        }
        return Palind(i+1, s);
    }
}
