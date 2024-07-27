package Advanced_DSA.Stackk;

import java.util.Stack;

public class IndexOfNearestSmallerEle {
    public static void main(String[] args) {
        // int arr[] = {4,6,10,11,7,6,3,5};
        int arr[] = {3,6,2,6,9,9,6};
        int res[] = solve(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    //Nearest smaller than or equal to element towards it's left
    public static int[] solve(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i] = -1;
            }
            else
            {
                ans[i] = st.peek();
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
    //         while(!st.isEmpty() && arr[st.peek()]>=arr[i])
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
