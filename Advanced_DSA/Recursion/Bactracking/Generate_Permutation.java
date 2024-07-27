package Advanced_DSA.Recursion.Bactracking;

import java.util.ArrayList;
import java.util.Collections;

public class Generate_Permutation {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        Generate_Permutation solution = new Generate_Permutation();
        ArrayList<ArrayList<Integer>> permutationresult = solution.permute(input);
        for(int i=0;i<permutationresult.size();i++)
        {
            ArrayList<Integer> permutation = permutationresult.get(i);
            System.out.println(permutation);
        }
    }

    private ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> input) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(input, input.size(), 0, result);
        return result;
    }
    public static void backtrack(ArrayList<Integer> A, int n, int i, ArrayList<ArrayList<Integer>> ans)
    {
        if(i==n-1)
        {
            ans.add(new ArrayList<>(A));
            return;
        }
        for(int j=i;j<n;j++)
        {
            Collections.swap(A,i,j);
            backtrack(A, n, i+1, ans);
            Collections.swap(A,i,j);
        }
    }
}
