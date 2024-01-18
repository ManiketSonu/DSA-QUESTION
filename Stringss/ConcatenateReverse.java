package Stringss;

public class ConcatenateReverse {
    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = "forGeeks";
        // String res = concatenatee(s1, s2);
        // System.out.println(res);
        String res = concatenatee(s1, s2);
        System.out.println(res);
    }
    public static String reverse(String str)
    {
        char ch[] = str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
    public static String concatenatee(String s1, String s2)
    {
        String result =  s1+s2;
        String res = reverse(result);
        return res;
    }
}
