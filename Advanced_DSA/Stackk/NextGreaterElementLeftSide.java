package Advanced_DSA.Stackk;

import java.util.Stack;

public class NextGreaterElementLeftSide {
    public static void main(String[] args) {
        int arr[] = {75, 71, 69, 72, 76, 73};
        int result[] = solve(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    //next greater element towards the right side
    public static int[] solve(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i] = 0;
            }
            else
            {
                ans[i] = st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }

    // public static int[] solve(int arr[])
    // {
    //     int n = arr.length;
    //     int ans[] = new int[n];
    //     Stack<Integer> st = new Stack<>();
    //     for(int i=0;i<n;i++)
    //     {
    //         while(!st.isEmpty() && arr[st.peek()]<=arr[i])
    //         {
    //             st.pop();
    //         }
    //         if(st.isEmpty())
    //         {
    //             ans[i] = -1;
    //         }
    //         else
    //         {
    //             ans[i] = st.peek();
    //         }
    //         st.push(i);
    //     }
    //     return ans;
    // }
}
