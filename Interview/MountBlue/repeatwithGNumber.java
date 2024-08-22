package Interview.MountBlue;

public class repeatwithGNumber {
    private static final char $2 = 0;
    private static final String $1 = null;
    public static void main(String[] args) {
        String str = "ab[3cd]";
        str.replaceAll("\\[(\\d+)(.)\\]", solve($2, Integer.parseInt($1)));
        System.out.println(str);
    }
    public static String solve(char ch, int count)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<count;i++)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}
