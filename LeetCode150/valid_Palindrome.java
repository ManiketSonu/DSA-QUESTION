package LeetCode150;

public class valid_Palindrome {
    public static void main(String[] args) {
        String str = "abca";
        System.out.print(isvalid(str));
    }
    public static String reverseString(String str)
    {
        int n = str.length();
        char ch[] = str.toCharArray();
        int low = 0;
        int high = n-1;
        while(low<high)
        {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        return new String(ch);
    }
    public static String checkPalindrome(String s)
    {
        char ch[] = s.toCharArray();
        String rez = reverseString(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != rez.charAt(i)){
                ch[i]=rez.charAt(i);
            }
        }
        return new String(ch).replaceAll("c", "");
    }
    public static boolean isvalid(String s){
        if(s.length()==1){
            return false;
        }
        String valid = checkPalindrome(s);
        return s.equals(valid);
    }
}
