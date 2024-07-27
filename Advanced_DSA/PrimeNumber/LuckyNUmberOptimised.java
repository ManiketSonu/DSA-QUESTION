package Advanced_DSA.PrimeNumber;

public class LuckyNUmberOptimised {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solve(n));
    }
    public static int solve(int A)
    {
        boolean[] isPrime = sieveOfEratosthenes(A);
        int ans = 0;
        for(int i=1;i<=A;i++)
        {
            if(isLuckyNumber(i, isPrime))
            {
                ans++;
            }
        }
        return ans;
    }
    private static boolean isLuckyNumber(int num, boolean[] isPrime) {
        int count = 0;
        for (int j = 1; j <= num; j++) {
            if (isPrime[j] && num % j == 0) {
                count++;
            }
        }
        return count == 2;
    }
    private static boolean[] sieveOfEratosthenes(int A) {
        boolean[] isPrime = new boolean[A + 1];
        for (int i = 2; i <= A; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= A; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= A; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
