package Advanced_DSA.Stackk;

import java.util.Stack;

public class Double_Character_trouble {
    public static void main(String[] args) {
        String A = "ab";
        String result = solve(A);
        System.out.println(result);
    }
    public static String solve(String A)
    {
        int n = A.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty() || st.peek()!=A.charAt(i))
            {
                st.push(A.charAt(i));
            }
            else
            {
                st.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())
        {
            char x = st.peek();
            st.pop();
            ans.append(x);
        }
        return reverse(ans.toString());
    }
    private static String reverse(String ans) {
        int n = ans.length();
        char[] charArray = ans.toCharArray();
        int left = 0;
        int right = n-1;
        while(left<right)
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
