package Advanced_DSA.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfElement {
    public static void main(String[] args) {
        int arr[] = {5, 17, 100, 11};

        int res[] = findMedian(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
    public static int[] findMedian(int A[])
    {
        int n = A.length;
        PriorityQueue<Integer> h1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> h2 = new PriorityQueue<>();

        for(int i=0;i<n;i++)
        {
            h2.add(A[i]);
            if(h2.size()>h1.size())
            {
                h1.add(h2.poll());
            }
            else if(h2.peek()<h1.peek())
            {
                h2.add(h1.poll());
                h1.add(h2.poll());
            }
            A[i] = h1.peek();
        }
        return A;


        //----------------------------------------------
        // int result[] = new int[n];

        // for(int i=0;i<n;i++)
        // {
        //     //first element of the stream..
        //     if(i==0)
        //     {
        //         h1.offer(A[i]);
        //         result[i] = h1.peek();
        //         continue;
        //     }

        //     if(A[i]>h1.peek())
        //     {
        //         h2.offer(A[i]);
        //     }
        //     else
        //     {
        //         h1.offer(A[i]);
        //     }

        //     int diff = h1.size()-h2.size();
        //     if(diff==0)
        //     {
        //         result[i] =  ((h1.peek()+h2.peek())/2);
        //     }
        //     else if(diff==1)
        //     {
        //         result[i] = h1.peek();
        //     }
        //     else if(diff==2)
        //     {
        //         h2.offer(h1.poll());
        //         result[i] = ((h1.peek()+h2.peek())/2);
        //     }
        //     else if(diff==-1)
        //     {
        //         h1.offer(h2.poll());
        //         result[i] = h1.peek();
        //     }
        // }
        // return result;
    }
}
