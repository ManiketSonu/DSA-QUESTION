package Stringss;

import java.util.HashSet;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String[] str = {"Kolkata", "Bihar", "Bihar", "Mumbai", "Delhi", "Delhi"};
        String result[] = solve(str);
        for(int i=0;i<result.length;i++)
        {
            String city = result[i];
            System.out.println(city);
        }
    }
    public static String[] solve(String str[])
    {
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<str.length;i++)
        {
            hs.add(str[i]);
        }
        String uniqueArray[] = hs.toArray(new String[hs.size()]);
        return uniqueArray;
    }
}
