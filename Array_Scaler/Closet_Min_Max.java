package Array_Scaler;

public class Closet_Min_Max {
    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 6, 9};
        System.out.println(Solvee(arr));
    }
    public static int Solvee(int arr[])
    {
        int n=arr.length;
        if(arr.length==1)
        {
            return 1;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        int length = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        if(min != max)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==min)
                {
                    minIndex=i;
                }
                else if(arr[i]==max)
                {
                    maxIndex=i;
                }
            }
            if(minIndex!=-1 && maxIndex!=-1)
            {
                int len = Math.abs(maxIndex-minIndex)+1;
                if(len<length)
                {
                    length=len;
                }
            }
            return length;
        }
        return 1;
    }
}
