package LeetCode150;

import java.util.Arrays;

public class longest_Common_prefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        System.out.println(CommonPrefix(str));
    }
    public static String CommonPrefix(String strs[])
    {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int index = 0;
        while(index<str1.length())
        {
            if(str1.charAt(index)==str2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
        if(index==0)
        {
            return "";
        }
        else
        {
            return str1.substring(0, index);
        }
    }
}
