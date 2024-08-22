package Interview.MountBlue;

import java.util.ArrayList;

public class EctractWord {
    public static void main(String[] args) {
        String str = "Grapes8$Mango6$Apple5";
        ArrayList<String> words = solve(str);
        System.out.println(words);
    }
    public static ArrayList<String> solve(String str)
    {
        ArrayList<String> result = new ArrayList<>();
        String segment[] = str.split("\\$");
        for(String seg:segment)
        {
            int lenStartIndex = findFirstDigitIndex(seg);
            if(lenStartIndex==-1 || lenStartIndex==0 || lenStartIndex==seg.length()-1)
            {
                continue;
            }
            //extract the word
            String word = seg.substring(0, lenStartIndex);
            String lengthstr = seg.substring(lenStartIndex);

            int expectedLength;
            try{
                expectedLength = Integer.parseInt(lengthstr);
            }
            catch(NumberFormatException e)
            {
                continue;
            }
            if(word.length()==expectedLength)
            {
                result.add(word);
            }
        }
        return result;
    }
    public static int findFirstDigitIndex(String str)
    {
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                return i;
            }
        }
        return -1;
    }
}
