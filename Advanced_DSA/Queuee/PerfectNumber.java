package Advanced_DSA.Queuee;

import java.util.ArrayDeque;
import java.util.Queue;

public class PerfectNumber {
    public static void main(String[] args) {
        int A = 2;
        System.out.println(solve(A));
    }
    public static String solve(int A)
    {
        if (A == 1) 
            return "11";

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        int count = 0;
        String ans = "";
        
        while (count < A) 
        { 
            int x = q.poll();
            if (isEvenDigit(x) && isPalindrome(x)) 
            {
                count++;
                ans = String.valueOf(x);
            }
            q.add(x * 10 + 1);
            q.add(x * 10 + 2);
        }
        return ans;
    }
    public static boolean isEvenDigit(int x)
    {
        int count = 0;
        while(x>0)
        {
            x = x/10;
            count++;
        }
        return (count%2==0);
    }
    public static boolean isPalindrome(int x)
    {
        int resversenum = 0;
        int temp = x;
        while(temp>0)
        {
            int digit = temp%10;
            resversenum = resversenum*10+digit;
            temp = temp/10;
        }
        return (x==resversenum);
    }
}
