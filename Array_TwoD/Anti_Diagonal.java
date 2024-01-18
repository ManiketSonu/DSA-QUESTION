package Array_TwoD;

public class Anti_Diagonal {
    public static void main(String arg[])
    {
        int arr[][] = {{1,2,3},{5,6,7},{9,10,11}};
        AntiDigonal(arr);
    }
    public static void AntiDigonal(int arr[][])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i][arr.length-1-i]);
            sum=sum+arr[i][arr.length-1-i];
        }
        System.out.println(sum);
    }

}
