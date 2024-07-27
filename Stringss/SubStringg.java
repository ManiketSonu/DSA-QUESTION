package Stringss;

public class SubStringg {
    public static void main(String arg[])
    {
        String A="abab";
        SuString(A);
    }
    public static String SuString(String A)
    {
        // String ans="";
        // StringBuilder ans=new StringBuilder(A);
        int n=A.length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(A.charAt(k));
                    
                }
                System.out.println();
            }
        }
        return ans.toString();
    }
}
