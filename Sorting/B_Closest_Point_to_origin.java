package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class B_Closest_Point_to_origin {
     public static void main(String[] args) {
        int arr[][] = {{1, -1},{2, -1}};
        int B = 1;
        int res[][] = solve(arr, B);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
     }
     public static int[][] solve(int A[][], int B)
     {
        Arrays.sort(A,new PointComparator());
        int res[][] = new int[B][2];
        for(int i=0;i<B;i++)
        {
            res[i] = A[i];
        }
        return res;
     }
     public static class PointComparator implements Comparator<int []>
     {

        @Override 
        public int compare(int[] o1, int[] o2) {
            int dis = (o1[0]*o1[0]+o1[1]*o1[1]);
            int dis1 = (o2[0]*o2[0]+o2[1]*o2[1]);
            return Integer.compare(dis, dis1);
        }
     }
}
