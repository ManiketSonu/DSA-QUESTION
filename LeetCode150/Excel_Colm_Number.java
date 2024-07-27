package LeetCode150;

public class Excel_Colm_Number {
    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(ColmNumber(s));
    }
    public static int ColmNumber(String s)
    {
        int n=s.length();
        int sum=0;
        int p=0;
        for(int i=n-1;i>=0;i--)
        {
            int temp = s.charAt(i)-64;
            sum = (int) (sum+Math.pow(26, p)*temp);
            p++;
        }
        return sum;
    }
}
