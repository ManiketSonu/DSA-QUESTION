package Array_TwoD;

public class AllDiagonal {
    public static void main(String[] args) {
        int arr[][] = {{0,1,2,3},
                        {4,5,6,7},
                        {9,0,0,2}};
        AllDIagon(arr);
    }
    public static void AllDIagon(int arr[][])
    {
        int n = arr.length;
        int m=arr.length;
        int row = n-1;
        int colms = 0;
        while(colms<m)
        {
            int i = row;
            int j = colms;
            while(i<n && j<m)
            {
                System.out.print(arr[i][j]);
                i++;
                j++;
            }
            System.out.println();
            if(row!=0)
                row--;
            else
                colms++;
        }
    }
}
