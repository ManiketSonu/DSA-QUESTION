package Advanced_DSA.Arrays;

public class Spiral_Matrix {
    public static  int[][] SpiralMatrix(int A){
        int[][] arr = new int[A][A];
        int value = 1;
        int top = 0, bottom = A - 1, left = 0, right = A - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                arr[top][j] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = value++;
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr[bottom][j] = value++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = value++;
                }
                left++;
            }
        }
        return arr;
        }
    public static void main(String[] args) {
        int[][] res = SpiralMatrix(5);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
