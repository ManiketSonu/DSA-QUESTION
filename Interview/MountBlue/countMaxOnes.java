package Interview.MountBlue;

public class countMaxOnes {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 0, 1, 0, 0, 0, 1};
        int res = countMones(arr);
        System.out.println(res);
    }
    public static int countMones(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                boolean canPlace = true;
                if(i-1>=0 && arr[i-1]!=0)
                {
                    canPlace = false;
                }
                if(i+1<n && arr[i+1]!=0)
                {
                    canPlace = false;
                }
                if(canPlace)
                {
                    arr[i] = 1;
                    count++;
                }
            }
        }
        return count;
    }
}
