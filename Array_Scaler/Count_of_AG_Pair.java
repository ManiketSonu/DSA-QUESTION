package Array_Scaler;

public class Count_of_AG_Pair {
    public static void main(String arg[])
    {
        String str = "abegag";
        System.out.println(AGPair(str));
    }
    public static int AGPair(String str)
    {
        // int count=0;
        // for(int i=0;i<str.length();i++)
        // {
        //     if(str.charAt(i)!='a')
        //     {
        //         continue;
        //     }
        //     for(int j=i+1;j<str.length();j++)
        //     {
        //         if(str.charAt(j)=='g')
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        /*---------------------------------------------------------- */
        /*int ans=0;
        int count=0;
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            if(str.charAt(i)=='g')
            {
                count++;
            }
            else if(str.charAt(i)=='a')
            {
                ans=ans+count;
            }
        }
        return ans;*/
        /*----------------------------------------------------------- */
        int ans=0;
        int count=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='a')
            {
                count++;
            }
            else if(str.charAt(i)=='g')
            {
                ans=ans+count;
            }
        }
        return ans;
    }
}
