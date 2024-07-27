package Interview.MountBlue;

import java.util.PriorityQueue;

public class FormBigNum {
    public static void main(String[] args) {
        int num1[] = {10,2};
        String result = solve(num1);
        System.out.println(result);
    }
    public static String solve(int num1[])
    {
        int n = num1.length;
        if(num1==null || n==0)
        {
            return "";
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->(b+a).compareTo(a+b));
        for(int num:num1)
        {
            pq.offer(String.valueOf(num));
        }

        if(pq.peek().equals("0"))
        {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty())
        {
            sb.append(pq.poll());
        }
        return sb.toString();
    }
}
