package Advanced_DSA.Arrays;

public class Max_Number_of1s {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 0},{0, 0, 0, 1},{0, 0, 1, 1},{0, 1, 1, 1}};
        System.out.println(oneSRowCount(arr));
    }
    public static int oneSRowCount(int arr[][])
    {
        int n=arr.length;
        int m=arr.length;
        int ans=0;
        int i=0;
        int j=m-1;
        while(i<n && j>=0)
        {
            while(j>=0 && arr[i][j]==1)
            {
                j--;
                ans=i;
            }
            i++;
        }
        return ans;
    }
}
