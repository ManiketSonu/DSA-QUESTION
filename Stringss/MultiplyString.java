package Stringss;

public class MultiplyString {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "456";
        String result = solve(s1, s2);
        System.out.println(result);
    }
    public static String solve(String num1, String num2)
    {
        int len1 = num1.length();
        int len2 = num2.length();
        int res[] = new int[len1+len2];
        for(int i=len1-1;i>=0;i--)
        {
            for(int j=len2-1;j>=0;j--)
            {
                int p = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = p+res[i+j+1];
                res[i+j] = res[i+j]+sum/10;
                res[i+j+1] = sum%10;
            }
        }
        StringBuilder s = new StringBuilder();
        boolean leadingzero = true;
        for(int i=0;i<res.length;i++)
        {
            if(leadingzero && res[i]==0)
            {
                continue;
            }
            leadingzero = false;
            s.append(res[i]);
        }
        if(s.length()==0)
        {
            s.append(0);
        }
        if(s.length()==0)
        {
            return "0";
        }
        else
        {
            return s.toString();
        }
    }
}
