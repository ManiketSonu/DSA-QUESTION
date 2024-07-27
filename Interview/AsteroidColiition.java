package Interview;

import java.util.Stack;

public class AsteroidColiition {
    public static void main(String[] args) {
        // int arr[] = {5,10,-5};
        int arr[] = {10,2,-5,4,-10,20,30,-40,40};
        int res[] = solve(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int asteroids[])
    {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(st.isEmpty() || asteroids[i]>0)
            {
                st.push(asteroids[i]);
            }
            else
            {
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i]))
                {
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i]))
                {
                    st.pop();
                }
                else
                {
                    if(st.isEmpty() || st.peek()<0)
                    {
                        st.push(asteroids[i]);
                    }
                }
            }
        }

        int res[] = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--)
        {
            res[i] = st.pop();
        }
        return res;
    }
}
