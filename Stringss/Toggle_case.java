package Stringss;

public class Toggle_case {
    public static void main(String arg[])
    {
        String A="maniket";
        System.out.print(Toggle(A));
    }
    public static String Toggle(String A)
    {
        // String ans="";
        // for(int i=0;i<A.length();i++)
        // {
        //     if(A.charAt(i)>=97 && A.charAt(i)<=122)
        //     {
        //         ans=ans+(char)(A.charAt(i)-32);
        //     }
        //     else if(A.charAt(i)>=65 && A.charAt(i)<=90)
        //     {
        //         ans=ans+(char)(A.charAt(i)+32);
        //     }
        // }
        // return ans;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)>=97 && A.charAt(i)<=122)
            {
                ans.append((char)(A.charAt(i)-32));
            }
            else if(A.charAt(i)>=65 && A.charAt(i)<=90)
            {
                ans.append((char)(A.charAt(i)+32));
            }
        }
        return ans.toString();
    }
}
