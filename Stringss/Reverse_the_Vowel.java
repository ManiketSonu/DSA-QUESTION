package Stringss;

public class Reverse_the_Vowel {
    public static void main(String[] args) {
        String str = "practice";
        String res = Vowelss(str);
        System.out.println(res);
    }
    public static String Vowelss(String s)
    {
        char ch[] = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(!vowelss(ch[l]))
                l++;
            else if(!vowelss(ch[r]))
                r--;
            else
            {
                 char temp= ch[l];
                 ch[l] = ch[r];
                 ch[r] = temp;
                 l++;
                 r--;
            }
        }
        return new String(ch);
    }
    public static boolean vowelss(char ch)
    {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
