package Advanced_DSA.Stackk;

import java.util.Stack;

public class NearestElement {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};
        int result[] = solve(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] solve(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && st.peek()>arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
