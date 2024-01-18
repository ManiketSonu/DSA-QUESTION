package Advanced_DSA.Arrays;

public class Plus_one {
    public static void main(String[] args) {
        int arr[]  = {9,9,9};
        int res[]  = AddOne(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] AddOne(int arr[])
    {
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]<9)
            {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int newnumber[] = new int[n+1];
        newnumber[0] = 1;
        return newnumber;
    }
}
