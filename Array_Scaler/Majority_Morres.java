package Array_Scaler;

public class Majority_Morres {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2,1,1};
        System.out.println(Majority(arr));
    }
    public static int Majority(int arr[])
    {
        int n=arr.length;
        int count=0;
        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    res = arr[i];
                }
                if(count>n/2)
                {
                    res=arr[i];
                }
            }
        }
        return res;
    }
}
