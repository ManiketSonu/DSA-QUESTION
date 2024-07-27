package LeetCode150;

public class StudentAward {
    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(SAward(s));
    }
    public static boolean SAward(String s)
    {
        int absent = 0;
        int late = 0;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch=='A')
            {
                absent++;
                if(absent>=2)
                {
                    return false;
                }
            }
            if(ch=='L')
            {
                late++;
                if(late>=3)
                {
                    return false;
                }
            }
            else
            {
                late = 0;
            }
        }
        return true;
    }
}
