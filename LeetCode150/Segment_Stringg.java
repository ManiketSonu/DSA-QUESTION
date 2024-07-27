package LeetCode150;

public class Segment_Stringg {
    public static void main(String[] args) {
        // String name = "Hello my name is Maniket";
        String name = "Hello";
        System.out.println(SegmentCount(name));
    }
    public static int SegmentCount(String s)
    {
        int n = s.length()-1;
        int count=0;
        for(int i=0;i<n;i++)
        {   
            if((i==0 || s.charAt(i-1)==' ') && s.charAt(i)!=' ')
            {
                count++;
            }
        }
        return count;
        // int n = name.length()-1;
        // int count = 0;
        // int i = 0;
        // while(i<n && name.charAt(i)==' ')
        // {
        //     i++;
        // }
        // while(i<n)
        // {
        //     if(name.charAt(i)!=' ')
        //     {
        //         while(i<n && name.charAt(i)!=' ')
        //         {
        //             i++;
        //         }
        //         count++;
        //     }
        //     else
        //     {
        //         while(i<n && name.charAt(i)==' ')
        //         {
        //             i++;
        //         }
        //     }    
        // }
        // return count;
    }
}
