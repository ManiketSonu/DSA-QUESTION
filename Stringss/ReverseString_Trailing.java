package Stringss;

public class ReverseString_Trailing {
    public static void main(String arg[])
    {
        String A="sky is blue";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
       StringBuilder ans=new StringBuilder();
       int end=A.length();
       for(int i=A.length()-1;i>=0;i--)
       {
        if(A.charAt(i)==' ')
        {
            end=i;
        }
        else if(i==0 || A.charAt(i-1)==' ')
        {
            if(ans.length()>0)
            {
                ans.append(' ');
            }
            ans.append(A.substring(i, end));
        }
       }
       return ans.toString();
    }
   
}
