package Stringss;

public class String_Opreation_Vowel {
    public static void main(String arg[])
    {
        String A="aeiOUz";
        System.out.print(Vowel(A));
    }
    public static String Vowel(String A)
    {
        String concatString=A+A;
        String replaceAll=concatString.replaceAll("[A-Z]", "");
        String finalResult=replaceAll.replaceAll("[aeiouAEIOU]", "#");
        return finalResult;
    }
}
