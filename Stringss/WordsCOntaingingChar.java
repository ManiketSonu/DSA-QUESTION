package Stringss;

import java.util.ArrayList;
import java.util.List;

public class WordsCOntaingingChar {
    public static void main(String[] args) {
        String s[] = {"abc","bcd","aaaa","cbc"};
        char ch = 'z';
        List<Integer> result = solve(s, ch);
        System.out.println(result);
    }
    public static List<Integer> solve(String s[], char ch)
    {
        int n = s.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(s[i].contains(String.valueOf(ch)))
            {
                res.add(i);
            }
        }
        return res;
    }
}
