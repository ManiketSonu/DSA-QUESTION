package Stringss;

public class Amazing_SubArray {
    public static void main(String[] args) {
        String S="ABEC";
        System.out.println(solve(S));
    }
    public static int solve(String S) {
        int n = S.length();
        int count = 0;
        int MOD = 10003;

        for (int i = 0; i < n; i++) {
            if (isVowel(S.charAt(i))) {
                count = (count + n - i) % MOD;
            }
        }
        return count;
    }

    public static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        else {
            return false;
        }
    }
}
