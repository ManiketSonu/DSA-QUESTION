package LeetCode150;

public class Valid_Perfectr_Square {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(PSquare(n));
    }
    public static boolean PSquare(int n)
    {
        int low = 1;
        int high = 30;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(mid*mid==n)
            {
                return true;
            }
            else if(mid*mid>n)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return false;
    }
}
