package Advanced_DSA.Recursion;

public class PrintTentoOne {
    public static void main(String[] args) {
        int A=10;
        Printt(A);
    }
    public static void Printt(int A)
    {
        printRecursive(1, A);
        System.out.println();
    }
    public static void printRecursive(int current, int A) {
        if (current > A) {
            return;
        }
        printRecursive(current + 1, A);
        System.out.print(current + " ");
    }
}
