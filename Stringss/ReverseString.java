package Stringss;

public class ReverseString {
    public static void main(String arg[])
    {
        String A="maniket";
        // System.out.print(Reve(A));
        System.out.println(solve(A));
    }
    // public static String Reve(String A)
    // {
    //     StringBuilder ans=new StringBuilder(A);
    //     ans.reverse();
    //     return ans.toString();
    // }
    public static String solve(String A) {
        int n=A.length();
        char[] charArray = A.toCharArray();
        int left=0;
        int right=n-1;
        while(left<right)
        {
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
