package Advanced_DSA.Greddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FlipkartInventoryManagement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 2, 3, 3));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(5, 6, 1, 3, 9));

        int result = solve(A, B);
        System.out.println(result);

    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B)
    {
        int mod = 1000000007;
        int n = A.size();
        int pairs[][] = new int[n][2];

        //populate the pairs array ans sort on the basis of expiry time
        for(int i=0;i<n;i++)
        {
            pairs[i][0] = A.get(i);
            pairs[i][1] = B.get(i);
        }
        Arrays.sort(pairs,(a,b)->Integer.compare(a[0],b[0]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int T = 0;
        for(int i=0;i<n;i++)
        {
            if(T<pairs[i][0])
            {
                minHeap.add(pairs[i][1]);
                T++;
            }
            else
            {
                if(pairs[i][1]>minHeap.peek())
                {
                    minHeap.poll();
                    minHeap.add(pairs[i][1]);
                }
            }
        }

        //calculate maxprofit
        long maxprofit = 0;
        while(!minHeap.isEmpty())
        {
            maxprofit = (maxprofit+minHeap.poll())%mod;
        }
        return (int)maxprofit;
    }
}
