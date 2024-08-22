package Interview.MountBlue;

import java.util.HashSet;

public class SubStringContainAllVowels {
    public static void main(String[] args) {
        String str = "aeoibsddaeiouudb";
        vowelSubString(str);
    }
    public static void vowelSubString(String str)
    {
        int n = str.length();
        HashSet<Character> hs = new HashSet<>();
        int start = 0;
        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);
            if(isVowel(ch)==true)
            {
                hs.add(ch);
                if(hs.size()>=5)
                {
                    System.out.print(str.substring(start, i+1) + " ");
                }
            }
            else
            {
                start = i+1;
                // hs.clear();
            }
        }
    }

    //time complexity is O(n^2) and space complexity is O(n)
    // public static void vowelSubString(String str)
    // {
    //     int n = str.length();
    //     HashSet<Character> hs = new HashSet<Character>();
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i;j<n;j++)
    //         {
    //             if(isVowel(str.charAt(j))==false)
    //             {
    //                 break;
    //             }
    //             hs.add(str.charAt(j));
    //             if(hs.size()==5)
    //             {
    //                 System.out.print(str.substring(i, j+1) + " ");
    //             }
    //         }
    //         hs.clear();
    //     }
    // }
    public static boolean isVowel(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
}
