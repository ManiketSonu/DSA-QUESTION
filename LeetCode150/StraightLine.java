package LeetCode150;

public class StraightLine {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(arr));
    }
    public static boolean checkStraightLine(int arr[][])
    {
        int x0 = arr[0][0];
        int y0 = arr[0][1];
        int x1 = arr[1][0];
        int y1 = arr[1][1];

        int dx = x1-x0;
        int dy = y1-y0;

        for (int i = 0; i < arr.length; i++) {
            int[] c = arr[i];
            int x = c[0];
            int y = c[1];
            if (dx * (y - y0) != dy * (x - x0)) {
                return false;
            }
        }
        return true;
    }
}
