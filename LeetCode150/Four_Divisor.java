package LeetCode150;

public class Four_Divisor {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sumFourDivisors(arr));
    }
    public static int sumFourDivisors(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int num = arr[i];
            if(hasExactlyFourDivisors(num))
            {
                sum = sum+getSumOfDivisors(num);
            }
        }
        return sum;
    }
    public static boolean hasExactlyFourDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
            if (count > 4) {
                return false; 
            }
        }
        return count == 4;
    }
    public static int getSumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
