package Advanced_DSA.Combinatorics;

public class Excel_Col {
    public static void main(String[] args) {
        int n = 2002;
        System.out.println(ExcelTitle(n));
    }
    public static String ExcelTitle(int n)
    {
        StringBuilder sb = new StringBuilder();
        while(n>0)
        {
            int r = (n-1)%26;
            sb.append((char)(r+'A'));
            n = (n-1)/26;
        }
        return sb.reverse().toString();
    }
}
