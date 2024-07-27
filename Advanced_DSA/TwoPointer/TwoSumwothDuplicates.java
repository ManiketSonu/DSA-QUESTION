package Advanced_DSA.TwoPointer;

public class TwoSumwothDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,3,3,4,4,4,5,5,5,5,6,7,7,7,10};
        int k = 10;
        System.out.println(solve(arr, k));
    }
    public static int solve(int arr[], int k)
    {
        int n = arr.length;
        int i=0;
        int j = n-1;
        int ans = 0;
        while(i<j)
        {
            if(arr[i]+arr[j]<k)
            {
                i++;
            }
            else if(arr[i]+arr[j]>k)
            {
                j--;
            }
            else
            {
                if(arr[i]==arr[j])
                {
                    int fre = j-i+1;
                    ans = ans+fre*(fre-1)/2;
                    break;
                }
                else
                {
                    int x = arr[i];
                    int count1 = 0;
                    while(i<n && arr[i]==x)
                    {
                        count1++;
                        i++;
                    }
                    x = arr[j];
                    int count2 = 0;
                    while(j>=0 && arr[j]==x)
                    {
                        count2++;
                        j--;
                    }
                    ans = ans+count1*count2;
                }
            }
        }
        return ans;
    }
}
