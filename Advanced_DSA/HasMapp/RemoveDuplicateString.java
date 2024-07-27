package Advanced_DSA.HasMapp;

import java.util.HashMap;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        char s[] = "geeksforgeeks".toCharArray(); 
        // int n = s.length;
        System.out.println(RString(s));
    }
    public static char[] RString(char ch[])
    {
        int n = ch.length;
        HashMap<Character, Integer> hs = new HashMap<>();
        String st = "";
        for(int i=0;i<n;i++)
        {
            if(!hs.containsKey(ch[i]))
            {
                st = st+ch[i];
                hs.put(ch[i], 1);
            }
        }
        return st.toCharArray();
    }
}
