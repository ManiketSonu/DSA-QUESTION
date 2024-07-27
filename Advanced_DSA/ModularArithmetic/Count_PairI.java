package Advanced_DSA.ModularArithmetic;

public class Count_PairI {
    public static void main(String[] args) {
        // int arr[] = {30,60,24,16,8,7,17,23,35,20,26,28,34,21,9,15,27};
        // int arr[] = {5, 17, 100, 11};
        // int arr[]  = {1, 2, 3, 4, 5};
        int arr[] = {4,3,6,3,8,12};
        System.out.println(CountP(arr, 6));
    }
    public static int CountP(int arr[], int M)
    {
        int n = arr.length;
        int freq[] = new int[M];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]%M]++;
        }

        int count = 0;
        count = freq[0]*(freq[0]-1)/2;
        int i = 1;
        int j = M-1;
        while(i<j)
        {
            count += (freq[i]*freq[j]);
            i++;
            j--;
        }
        if(i==j)
        {
            count += (freq[i]*freq[i]-1)/2;
        }
        return count;
    }
}
