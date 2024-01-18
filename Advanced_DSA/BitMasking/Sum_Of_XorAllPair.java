package Advanced_DSA.BitMasking;

public class Sum_Of_XorAllPair {
    public static void main(String[] args) {
        int arr[] = {3,4,2};
        System.out.println(Summ(arr));
    }
    public static int Summ(int A[])
    {
        int n = A.length;
        int sumXOR = 0;
        for (int i = 0; i < 32; i++) { 
            int countOnes = 0;
            for (int j = 0; j < n; j++) {
                if ((A[j] & (1 << i)) != 0) {
                    countOnes++;
                }
            }
            sumXOR += (countOnes * (n - countOnes) * (1 << i));
        }
        return sumXOR;
    }
}
