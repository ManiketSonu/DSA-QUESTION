package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class factor_count {
    public static void main(String[] args) {
        int arr[] = {6, 8, 9};
        factor_count fc = new factor_count();
        int res[] = fc.solve(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public int[] solve(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        Arrays.sort(B, new MyComparator());
        for (int i = 0; i < A.length; i++) {
            A[i] = B[i];
        }
        return A;
    }

    private static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            int count1 = countFactors(num1);
            int count2 = countFactors(num2);
            if (count1 != count2) {
                return count1 - count2;
            } else {
                return num1 - num2;
            }
        }

        private int countFactors(int n) {
            int count = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (n / i == i) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }
            return count;
        }
    }
}
