package Advanced_DSA.Recursion.Bactracking;

import java.util.ArrayList;

public class Geberate_Subset {
    public static void main(String[] args) {
        // ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int arr[] = {1,2,3};
        bactrack(arr, arr.length, temp, 0, result);
        for(int i=0;i<result.size();i++)
        {
            ArrayList<Integer> subset = result.get(i);
            System.out.println(subset);
        }
    }
    public static void bactrack(int arr[], int n, ArrayList<Integer> temp, int i, ArrayList<ArrayList<Integer>> ans)
    {   
        // Collections.sort((List<Integer>) ans);
        if(i==n)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        bactrack(arr, n, temp, i+1, ans);
        temp.add(arr[i]);
        bactrack(arr, n, temp, i+1, ans);
        temp.remove(temp.size()-1);
    }
}
