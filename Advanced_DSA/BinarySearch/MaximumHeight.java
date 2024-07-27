package Advanced_DSA.BinarySearch;

public class MaximumHeight {
    public static void main(String[] args) {
        int A = 20;
        System.out.println(solve(A));
    }
    public static int solve(int A)
    {
        int left = 0;
        int right = A;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            int sum = mid*(mid+1)/2;
            if(sum==A)
            {
                return mid;
            }
            else if(sum<=A)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return right;
    }
}
