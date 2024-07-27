package Advanced_DSA.Recursion.Bactracking;

import java.util.ArrayList;

public class Generate_Subset1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        Generate_Subset1 solution = new Generate_Subset1();
        ArrayList<ArrayList<Integer>> subsetsResult = solution.subsets(input);
        for(int i=0;i<subsetsResult.size();i++)
        {
            ArrayList<Integer> subset  = subsetsResult.get(i);
            System.out.println(subset);
        }
    }
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        A.sort(null);
        generateSubSet(A, 0, new ArrayList<>(), result);
        return result;
    }
    public static void generateSubSet(ArrayList<Integer> A, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result)
    {
        result.add(new ArrayList<>(current));
        for(int i=index; i<A.size();i++)
        {
            current.add(A.get(i));
            generateSubSet(A, i+1, current, result);
            current.remove(current.size()-1);
        }
    }
}
