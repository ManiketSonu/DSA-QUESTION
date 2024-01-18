package LeetCode150;

public class IndexOccurences {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(Solve(haystack, needle));
    }
    public static int Solve(String hayStack, String needle)
    {
        for(int i=0;i<hayStack.length()-needle.length()+1;i++)
        {
            if(hayStack.charAt(i)==needle.charAt(0))
            {
                if(hayStack.substring(i, needle.length()+i).equals(needle))
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
