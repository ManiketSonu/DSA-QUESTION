package LeetCode150;

public class Count_And_Say {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n)
    {
        if(n==1)
        {
            return "1";
        }
        if(n==2)
        {
            return "11";
        }
        String s = "11";
        for(int i=3;i<=n;i++)
        {
            StringBuilder t = new StringBuilder();
            s = s+'&';
            int count=1;
            for(int j=1;j<s.length();j++)
            {
                if(s.charAt(j)!=s.charAt(j-1))
                {
                    t.append(count).append(s.charAt(j-1));
                    count = 1;
                }
                else
                {
                    count++;
                }
            }
            s = t.toString();
        }
        return s;
    }
}
