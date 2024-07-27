package Advanced_DSA.Stackk;

import java.util.Stack;

public class LargestRectangleHistgram {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int result[] = solve1(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        // System.out.println(Sollution(arr));
    }
    public static int Sollution(int arr[])
    {
        int ls[] = solve(arr);
        int rs[] = solve1(arr);
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr.length==1)
            {
                return arr[i];
            }
            ans = Math.max(ans,arr[i]*(rs[i]-ls[i]-1));
        }
        return ans;
    }
    public static int[] solve(int arr[])
    {
        int n = arr.length;
        int nextSmallerleft[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nextSmallerleft[i] = -1;
            }
            else
            {
                nextSmallerleft[i] = st.peek();
            }
            st.push(i);
        }
        return nextSmallerleft;
    }
    public static int[] solve1(int arr[])
    {
        int n = arr.length;
        int nextSmallerright[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nextSmallerright[i] = -1;
            }
            else
            {
                nextSmallerright[i] = st.peek();
            }
            st.push(i);
        }
        return nextSmallerright;
    }
}
