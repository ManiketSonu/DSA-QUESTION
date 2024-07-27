package Advanced_DSA.Stackk;

import java.util.Stack;

public class MaxAndMinOptimised {
    public static void main(String[] args) {
        int arr[] = {2,5,3};
        System.out.println(solve(arr));
        // int res[] = nextSmallerrightSide(arr);
        // for(int i=0;i<res.length;i++)
        // {
        //     System.out.print(res[i]+ " ");
        // }
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int maxSum = 0;
        int gl[] = nearestgreaterleftSide(arr);
        int gr[] = nextgreaterrightSide(arr);
        for (int i = 0; i < n; i++) {
            maxSum += arr[i] * (i - gl[i]) * (gr[i] - i);
        }

        int minSum = 0;
        int sl[] = nextSmallerleftSide(arr);
        int sr[] = nextSmallerrightSide(arr);
        for (int j = 0; j < n; j++) {
            minSum += arr[j] * (j - sl[j]) * (sr[j] - j);
        }
        return maxSum - minSum;
    }
    public static int[] nearestgreaterleftSide(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static int[] nextgreaterrightSide(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static int[] nextSmallerleftSide(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static int[] nextSmallerrightSide(int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
