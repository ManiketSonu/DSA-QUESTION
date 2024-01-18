package Stringss;

public class Count_camelCase_Char {
    public static void main(String[] args) {
        String str = "ckjkUUYII";
        System.out.println(coutCamelCase(str));
    }
    public static int coutCamelCase(String str)
    {
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                count++;
            }
        }
        return count;
    }
}
