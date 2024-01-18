package Stringss;

public class Palindrome {
    public static void main(String[] args) {
        String S = "aba";
        // System.out.println(Reversee(S));
        System.out.println(Solve(S));
    }
    public static String Reversee(String S)
    {
        int n=S.length();
        char[] ch = S.toCharArray();
        int left=0;
        int right=n-1;
        while(left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
        // String res ="";
        // for(int i=n-1;i>=0;i--){
        //     res += S.charAt(i);
        // }
        // return res;
    }
    public static int Solve(String s)
    {
        String res=Reversee(s);
        if(res.equals(s))
        {
            return 1;
        }
        return 0;
    }
}
