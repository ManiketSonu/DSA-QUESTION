package Stringss;

public class Remove_AlphaNumberic {
    public static void main(String[] args) {
        String str = "AA1d23cBB4";
        String res = AlphaNumberic(str);
        System.out.println(res);
    }
    public static String AlphaNumberic(String str)
    {
        StringBuilder ans=new StringBuilder();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(!charatcterr(str.charAt(i)))
            {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static boolean charatcterr(char ch)
    {
        if(ch >= 65 && ch<= 90 || ch>= 97 && ch<= 122)
        {
            return true;
        }
        return false;
        // return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }
}
