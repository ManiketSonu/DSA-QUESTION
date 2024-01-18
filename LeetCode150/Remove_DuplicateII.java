package LeetCode150;

public class Remove_DuplicateII {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,2,2,2,3};
        System.out.println(RemoveDuplicates(arr));
    }
    public static int RemoveDuplicates(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i];
            if(count<2 || n!=arr[count-2])
            {
                arr[count] = n;
                count++;
            }
        }
        return count;
    }
}
