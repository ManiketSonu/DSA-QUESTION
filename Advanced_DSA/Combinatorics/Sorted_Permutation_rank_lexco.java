package Advanced_DSA.Combinatorics;

import java.util.Arrays;

public class Sorted_Permutation_rank_lexco {
    public static void main(String[] args) {
        String A = "baa";
        System.out.println(findRank(A));
    }
    public static long fact(long i) {
        if (i == 0)
            return 1;
        return (i * (fact(i - 1) % 1000003)) % 1000003;
    }
    public static  long inverseModuleWithPrimeDivisor(long i, long b) {
        if (b == 0)
            return 1;
        long res = inverseModuleWithPrimeDivisor(i, b / 2) % 1000003;
        if (b % 2 == 1) {
            return (res * ((res * (i % 1000003)) % 1000003) % 1000003);
        } else {
            return (res * ((res) % 1000003)) % 1000003;
        }
    }
    public static int findRank(String A) {
        int n = A.length();
        long ans = 0;

        for (int i = 0; i < A.length(); i++) {
            int count = 0;

            for (int j = i + 1; j < A.length(); j++) {
                if (A.charAt(i) > A.charAt(j)) {
                    count++;
                }
            }

            int[] freq = new int[52];
            Arrays.fill(freq, 0);

            for (int k = i; k < A.length(); k++) {
                if (A.charAt(k) >= 'A' && A.charAt(k) <= 'Z') {
                    freq[A.charAt(k) - 'A']++;
                } else {
                    freq[26 + (A.charAt(k) - 'a')]++;
                }
            }

            long totalFreq = 1;
            for (int l = 0; l < 52; l++) {
                if (freq[l] > 1) {
                    long f = fact(freq[l]) % 1000003;
                    totalFreq = (totalFreq * f) % 1000003;
                }
            }

            ans = (ans + ((fact(n - i - 1) * ((count * inverseModuleWithPrimeDivisor(totalFreq, 1000001)) % 1000003)) % 1000003)) % 1000003;
        }

        return (int) ((ans + 1) % 1000003);
    }
}
