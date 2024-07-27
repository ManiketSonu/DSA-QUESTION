package Advanced_DSA.Recursion.StriverSeries;

import java.util.ArrayList;

public class printAllSubsequences {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        solve(0, list, arr, n);
    }
    public static void solve(int index, ArrayList<Integer> list, int arr[], int n)
    {
        if(index==n)
        {
            for(int i:list)
            {
                System.out.print(i);
            }
            if(list.size()==0)
            {
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        solve(index+1, list, arr, n);
        list.add(arr[index]);
        solve(index+1, list, arr, n);
        list.remove(list.size()-1);
    }
}
