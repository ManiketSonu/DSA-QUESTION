package Advanced_DSA.oops;

public class Demo {
    public static void main(String[] args) {
        String s = "abcdzdcab";
        System.out.println(solve(s));
    }   
    public static String solve(String s)
    {
        int n = s.length();
        int low = 0;
        int high = n-1;
        StringBuilder sb = new StringBuilder();
        while(low<=high)
        {
            if (s.charAt(low)==s.charAt(high)) {
                sb.append(s.charAt(high));
            }
            low++;
            high--;
        }
        return sb.toString();
    }
    // public static int solve(int arr[])
    // {
    //     int count = 0;
    //     int n = arr.length;
    //     for(int i=1;i<n-1;i++)
    //     {
    //         if(arr[i]<arr[i-1])
    //         {
    //             count++;
    //         }
    //         if(arr[i+1]<arr[i])
    //         {
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}
