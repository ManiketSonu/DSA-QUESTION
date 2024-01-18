package Stringss;

public class SunString_Range {
    public static void main(String[] args) {
        String str = "maniketkumar";
        String result = range(str, 1, 3);
        System.out.print(result);
    }
    public static String range(String str, int l, int r)
    {
        String ans="";
        for(int i=l;i<=r;i++)
        {
            System.out.println(str.charAt(i));
        }
        return ans.toString();
    }
}
