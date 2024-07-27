package LeetCode150;

public class Largest_Element_Twice {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1};
        System.out.println(largest(arr));
    }
    public static int largest(int arr[])
    {
        int n = arr.length;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
                index = i;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i!=index && max>=2*arr[i])
            {
                count++;
            }
        }
        if(count==n-1)
        {
            return index;
        }
        else
        {
            return -1;
        }
    }
}
