package LeetCode150;

public class Third_Maximum {
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int arr[])
    {
        int n = arr.length;
        if(n==1)
        {
            return arr[0];
        }
        if(n==2)
        {
            return Math.max(arr[0], arr[1]);
        }
        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==m1 || arr[i]==m2 || arr[i]==m3)
            {
                continue;
            }
            if(arr[i]>m1)
            {
                m3 = m2;
                m2 = m1;
                m1 = arr[i];
            }
            else if(arr[i]>m2)
            {
                m3 = m2;
                m2 = arr[i];
            }
            else if(arr[i]>m3)
            {
                m3 = arr[i];
            }
        }
        if(m3==Long.MIN_VALUE)
        {
            return (int)m1;
        }
        return (int)m3;
    }
}
