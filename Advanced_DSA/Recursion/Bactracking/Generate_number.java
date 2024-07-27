package Advanced_DSA.Recursion.Bactracking;

import java.util.ArrayList;

public class Generate_number {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        backtrackNum(2, 0, new int[]{1,2}, 0, ans);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
    public static void backtrackNum(int n, int i, int choices[], int temp, ArrayList<Integer> ans)
    {
        if(i==n)
        {
            ans.add(temp);
            return;
        }
        for(int j=0;j<choices.length;j++)
        {
            backtrackNum(n, i+1, choices, temp*10+choices[j], ans);
        }
    }
}
