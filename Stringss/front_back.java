package Stringss;

public class front_back {
    public static void main(String[] args) {
        String S = "Hello";
        String res = Convert(S);
        System.out.println(res);
    }
    public static String Convert(String S)
    {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ans.append((char)(122-(ch-97)));
            }
            else if(ch>='A' && ch<='Z')
            {
                ans.append((char)(90-(ch-65)));
            }
            else
            {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
