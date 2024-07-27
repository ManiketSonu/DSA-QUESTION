package LeetCode150;

public class H_Index {
    public static void main(String[] args) {
        int arr[] = {1,3,1};
        System.out.println(Citiation(arr));
    }
    public static int Citiation(int arr[])
    {
        int n = arr.length;
        int arr1[] = new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(i>n)
            {
                arr1[n]++;
            }
            else
            {
                arr1[i]++;
            }
        }
        int count = 0;
        for(int i=n;i>=0;i--)
        {
            count = count+arr1[i];
            if(count>=i)
            {
                return i;
            }
        }
        return 0;
    }
}
