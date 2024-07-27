package LeetCode150;

public class Reverse_VowelString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(VowelReverse(s));
    }
    public static String VowelReverse(String s)
    {
        int n=s.length();
        char ch[] = s.toCharArray();
        int start=0;
        int end=n-1;
        while(start<end)
        {
            if(!isVowel(ch[start]))
            {
                start++;
            }
            else if(!isVowel(ch[end]))
            {
                end--;
            }
            else
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end]  = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    private static boolean isVowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            return true;
        }
        return false;
    }
}
