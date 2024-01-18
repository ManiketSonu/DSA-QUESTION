package Advanced_DSA.Recursion;

public class Tower_of_hanoi {
    public static void main(String[] args) {
        int A1 = 2;
        // int A2 = 3;
        int[][] result1 = solveHanoi(A1);
        // int[][] result2 = solveHanoi(A2);
        printResult(result1);
        // printResult(result2);
    }
    public static int[][] solveHanoi(int A) {
        int[][] result = new int[(int) Math.pow(2, A) - 1][3];
        moveDisks(A, 1, 3, 2, result, 0);
        return result;
    }
    private static int moveDisks(int n, int source, int destination, int auxiliary, int[][] result, int index) {
        if (n == 1) {
            result[index][0] = 1; // Disk number
            result[index][1] = source; // Start tower
            result[index][2] = destination; // End tower
            return index + 1;
        }
        index = moveDisks(n - 1, source, auxiliary, destination, result, index);
        result[index][0] = n; // Disk number
        result[index][1] = source; // Start tower
        result[index][2] = destination; // End tower
        index++;
        index = moveDisks(n - 1, auxiliary, destination, source, result, index);
        return index;
    }
    private static void printResult(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print("[" + result[i][0] + " " + result[i][1] + " " + result[i][2] + "]");
        }
        System.out.println();
    }
}
