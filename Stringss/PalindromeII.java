package Stringss;

public class PalindromeII {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: panama";
        System.out.println(isSolve(s));
    }
    public static String reverseString(String s)
    {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i=0;
        int j=s.length()-1;
        char[] str = s.toCharArray();
        while(i<=j)
        {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(str);
    }
    public static boolean isSolve(String s)
    {
        String res = reverseString(s);
        return res.equals(s.toLowerCase().replaceAll("[^a-z0-9]", ""));

    }
}
