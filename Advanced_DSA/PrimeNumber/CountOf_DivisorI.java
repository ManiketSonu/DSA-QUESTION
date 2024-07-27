package Advanced_DSA.PrimeNumber;

public class CountOf_DivisorI {
    public static void main(String[] args) {
        int A[] = {8,9,10};
        int res[] = solve(A);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] solve(int A[]) {
        int n = A.length;
        int sol[] = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = A[i];
            int ans = 1;
            for (int j = 2; j * j <= temp; j++) {
                if (temp % j == 0) {
                    int count = 0;
                    while (temp % j == 0) {
                        temp /= j;
                        count++;
                    }
                    ans *= (count + 1);
                }
            }
            if (temp > 1) {
                ans *= 2; // If there is a remaining prime factor greater than sqrt(temp)
            }
            sol[i] = ans;
        }
        return sol;
    }

    public static int Sieve(int temp) {
        int isPrime[] = new int[100005];
        for (int i = 1; i <= 100000; i++) {
            isPrime[i] = i;
        }
        for (int i = 2; i * i <= 100000; i++) {
            for (int j = i * i; j <= 100000; j = j + i) {
                if (isPrime[j] == i) {
                    isPrime[j] = i;
                }
            }
        }
        return isPrime[temp];
    }
}
