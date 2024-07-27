package Interview.MountBlue;

public class DistributeCandies {
    public static void main(String[] args) {
        int arr[] = {1,0,2};
        int result = solve(arr);
        System.out.println(result);
    }
    public static int solve(int arr[])
    {
        int n = arr.length;
        int res[] = new int[n];
        //Intitalize 1 candies to each baby
        for(int i=0;i<n;i++)
        {
            res[i] = 1;
        }

        //trvaerse left to right
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                res[i] = res[i-1]+1;
            }
        }

        //traverse right to left
        for(int i=n-2;i>=0;i--)
        {
            if(res[i]>res[i+1])
            {
                res[i] = Math.max(res[i],res[i+1]+1);
            }
        }

        //count total candies
        int totalCandies = 0;
        for(int cand:res)
        {
            totalCandies = totalCandies+cand;
        }
        return totalCandies;
    }
}
