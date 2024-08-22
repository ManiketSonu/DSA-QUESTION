package Interview.MountBlue;

public class repeatCharacter {
    public static void main(String[] args) {
        String str = "3a2b1c";
        String res = solve(str);
        System.out.println(res);
    }
    public static String solve(String str)
    {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int count = 0;
            while(i<n && Character.isDigit(str.charAt(i)))
            {
                count = count*10+(str.charAt(i)-'0');
                i++;
            }
            if(i<n)
            {
                char ch = str.charAt(i);
                for(int j=0;j<count;j++)
                {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
