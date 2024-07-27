package Interview;

public class Strindiff {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        char res = solve(s, t);
        System.out.println(res);
    }
    public static char solve(String s, String t)
    {
        int n = s.length();
        int m = t.length();

        int total = 0;
        for(int i=0;i<m;i++)
        {
            total = total+t.charAt(i);
        }

        for(int i=0;i<n;i++)
        {
            total = total-s.charAt(i);
        }

        return (char)total;
    }
}
