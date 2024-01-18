package Stringss;

public class CheckString {
    public static void main(String[] args) {
        String str = "gggg";
        boolean result = countt(str);
        System.out.println(result);
    }
    public static boolean countt(String str)
    {
        if(str==null || str.length()==0)
        {
            return false;
        }
        // char ch = str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(i-1))
                return false;
        }
        return true;
    }
}
