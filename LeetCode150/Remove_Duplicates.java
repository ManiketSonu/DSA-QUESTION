package LeetCode150;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(RemoveDuplicate(arr));
    }
    public static int RemoveDuplicate(int arr[])
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i>n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
            }
        }
        return count;
    }
}
