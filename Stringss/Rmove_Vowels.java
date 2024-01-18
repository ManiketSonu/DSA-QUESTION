package Stringss;

public class Rmove_Vowels {
    public static void main(String[] args) {
        String str="practice";
        String result = Voweslss(str);
        System.out.println(result);
    }
    public static String Voweslss(String str)
    {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(!isVowel(str.charAt(i)))
            {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static boolean isVowel(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
}
