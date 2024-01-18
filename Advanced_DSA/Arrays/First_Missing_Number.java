package Advanced_DSA.Arrays;

public class First_Missing_Number {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2};
        System.out.println(firstMissingNumber(arr));
    }
    public static int firstMissingNumber(int arr[])
    {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] >= 1 && arr[i] <= n) {
                int correctIndex = arr[i] - 1;
                if (arr[correctIndex] != arr[i]) {
                    int temp = arr[correctIndex];
                    arr[correctIndex] = arr[i];
                    arr[i] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
    
        return n + 1;
    //     int n=arr.length;
    //     int i=0;
    //     while(i<n)
    //     {
    //         if(arr[i]>=1 && arr[i]<=n)
    //         {
    //             int CorrectIndex = arr[i]-1;
    //             if(arr[CorrectIndex]!=arr[i])
    //             {
    //                 int temp = arr[CorrectIndex];
    //                 arr[CorrectIndex] = arr[i];
    //                 arr[i] = temp;
    //             }
    //             else
    //             {
    //                 i++;
    //             }
    //         }
    //         else 
    //         {
    //             i++;
    //         }
    //         for(i=0;i<n;i++)
    //         {
    //             if(arr[i]!=i+1)
    //             {
    //                 return i+1;
    //             }
    //         }  
    //     }
    //     return n+1;
    }
}
