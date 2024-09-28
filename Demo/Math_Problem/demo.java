package Demo.Math_Problem;

public class demo implements Runnable{
    public static void main(String[] args) {
        // int[] arr = {58, 40, 51, 88, 70, 67, 28, 46, 77, 28, 28, 93, 53, 17, 12, 31, 45, 47, 34, 95, 95, 92, 41, 10, 63, 42, 51, 89, 99, 52, 69, 31, 14, 25, 31, 40, 19, 14, 63, 9, 71, 28, 27, 1, 2, 11, 69, 82, 30, 92, 3, 89, 78, 94, 28, 2, 11, 84, 62, 61, 9, 44, 31, 67, 99, 65, 75, 26, 60, 36, 38, 94, 53, 9, 90, 43, 31, 15, 32, 13, 88, 70, 49, 73, 4, 51, 40, 1, 33, 44, 44, 75, 58, 84, 71, 26, 83, 20, 55, 21};
        // int arr[] = {1,2,3};
        // System.out.println(solve(arr,10));
        // String str[] = {"Patna", "Banaras", "kolkata", "Patna", "Banaras", "pune", "Gurgaon"};
        // System.out.println(solve(str));
        // int arr[] = {1, -1, -2, 2};
        // int res = solve(arr);
        // System.out.println(res);
        // int arr[] = {10,9,4,5,4,8,6};
        // int arr[] = {1,2,3,4,5,6};
        // int B = 1;
        // int res = solve(arr, B);
        // System.out.println(res);
        // int res = solve(arr);
        // System.out.println(res);
        Thread thread1 = new Thread(new demo());
        Thread thread2 = new Thread(new demo());

        // Starting the threads
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // public static int solve(int arr[])
    // {
    //     int n = arr.length;
    //     int count = 0;
    //     for(int i=0;i<n-1;i++)
    //     {
    //         if(Math.abs(arr[i]-arr[i+1])==1)
    //         {
    //             count++;
    //         }
    //         else
    //         {
    //             continue;
    //         }
    //     }
    //     return count;
    // }
    // public static int solve(int arr[], int B)
    // {
    //     int count = 0;
    //     int n = arr.length;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(Math.abs(arr[i]-arr[j])==B)
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    // public static int solve(int arr[])
    // {
    //     int n = arr.length;
    //     int pf[] = new int[n];
    //     pf[0] = arr[0];
    //     for(int i=1;i<n;i++)
    //     {
    //         pf[i] = pf[i-1]+arr[i];
    //     }

    //     int count = 0;
    //     HashMap<Integer, Integer> hs = new HashMap<>();
    //     for(int i=0;i<n;i++)
    //     {
    //         if(pf[i]==0 || hs.containsKey(pf[i]))
    //         {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static HashSet<String> solve(String str[])
    // {
    //     int n = str.length;
    //     HashSet<String> hs = new HashSet<>();
    //     for(int i=0;i<n;i++)
    //     {
    //         if(!hs.contains(str[i]))
    //         {
    //             hs.add(str[i]);
    //         }
    //     }
    //     return hs;
    // }
    // public static int solve(int A[], int B)
    // {
    //     int leftMax = 0;
    //     int leftSum = 0;
    //     int rightMax = 0;
    //     int rightSum = 0;
        
    //     // Fill glasses from the front
    //     for (int i = 0; i < A.length; i++) {
    //         if (leftSum + A[i] <= B) {
    //             leftSum += A[i];
    //             leftMax++;
    //         } else {
    //             break;
    //         }
    //     }
        
    //     // Fill glasses from the back
    //     for (int i = A.length - 1; i >= 0; i--) {
    //         if (rightSum + A[i] <= B) {
    //             rightSum += A[i];
    //             rightMax++;
    //         } else {
    //             break;
    //         }
    //     }
        
    //     return Math.max(leftMax, rightMax);
    // }
}
