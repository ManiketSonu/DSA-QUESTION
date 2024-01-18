package Stringss;

public class Longest_Palindrome {
    public static void main(String[] args) {
        String s="abacab";
        SubStrin(s);
    }
    public static String SubStrin(String s)
    {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
        }
        return ans.toString();
    }
    
}
