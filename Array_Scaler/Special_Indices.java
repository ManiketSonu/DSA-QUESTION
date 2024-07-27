package Array_Scaler;

public class Special_Indices {
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        System.out.println(SIndices(arr));
    }
    public static int SIndices(int arr[])
    {
        int n = arr.length;
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                evenSum +=arr[i];
            }
            else
            {
                oddSum +=arr[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                evenSum -=arr[i];
            }
            else
            {
                oddSum -=arr[i];
            }
            if(evenSum==oddSum)
            {
                count++;
            }
        }
        return count;
    }
}
