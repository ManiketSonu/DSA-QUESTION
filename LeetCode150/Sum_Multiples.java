package LeetCode150;

public class Sum_Multiples {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(SumMultiple(n));
    }
    public static int SumMultiple(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0)
            {
                sum = sum+i;
            }
            else if(i%5==0)
            {
                sum = sum+i;
            }
            else if(i%7==0)
            {
                sum = sum+i;
            }
        }
        return sum;
    }
}
