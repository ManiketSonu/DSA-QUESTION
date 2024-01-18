package Array_Scaler;

public class Contribution_Technique {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(Contribution(arr));
    }
    public static int Contribution(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i]*(i+1)*(n-i);
        }
        return sum;
    }
}
