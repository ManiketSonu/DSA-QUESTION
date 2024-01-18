package Stringss;

public class Last_index_Of_One {
    public static void main(String[] args) {
        String s="00001";
        System.out.println(lastIndex(s));
    }
    public static int lastIndex(String s) {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                return i;
            }
            // else if(s.charAt(i)==0)
            // {
            //     return -1;
            // }
        }
        return -1;
    }
}
