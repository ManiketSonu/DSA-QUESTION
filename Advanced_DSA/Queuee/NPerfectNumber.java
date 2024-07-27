package Advanced_DSA.Queuee;

import java.util.ArrayDeque;
import java.util.Queue;

public class NPerfectNumber {
    public static void main(String[] args) {
        int A = 3;
        int result[] = solve(A);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]+" ");
        }
    }
    public static int[] solve(int A)
    {
        if(A==0)
        {
            return new int[0];
        }
        int res[] = new int[A];
        Queue<Integer> qu = new ArrayDeque<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        int count = 0;
        while (!qu.isEmpty() && count<A) {
            int x = qu.poll();
            res[count] = x;
            count++;
            if(count==A)
            {
                break;
            }
            qu.add(x*10+1);
            qu.add(x*10+2);
            qu.add(x*10+3);
        }
        return res;
    }
}
