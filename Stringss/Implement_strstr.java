package Stringss;

public class Implement_strstr {
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String x = "For";
        System.out.println(strstr(s, x));
    }
    public static int strstr(String s, String x)
    {
        if(s.contains(x))
        {
            return s.indexOf(x);
        }
        else{
            return -1;
        }
    }
}
