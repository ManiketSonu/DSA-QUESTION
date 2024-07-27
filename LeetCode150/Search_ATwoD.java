package LeetCode150;

public class Search_ATwoD {
    public static void main(String[] args) {
        int arr[][] = {{1,3}};
        int target = 3;
        System.out.println(Search(arr, target));
    }
    public static boolean Search(int arr[][], int target)
    {
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
