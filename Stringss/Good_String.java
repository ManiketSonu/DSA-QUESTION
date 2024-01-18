package Stringss;

public class Good_String {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(GoodString(s));
    }
    public static String GoodString(String s)
    {
        boolean flag = true;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                flag=false;
            }
        }
        if(flag==true)
            return "YES";
        else
            return "NO";
    }
}
