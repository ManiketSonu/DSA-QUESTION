package Stringss;

public class IsAlphaNumeric {
    public static void main(String arg[])
    {
        // char A[]  = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        char A[] = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        System.out.println(solve(A));
    }
    public static int solve(char[] A) {
        int n=A.length;
        // for(int i=0;i<n;i++)
        // {
        //     if((A[i]>=97 && A[i]<=122) || (A[i]>=65 && A[i]<=90) || (A[i]>=48 && A[i]<=57))
        //     {
        //         return 1;
        //     }
            // else if(A[i]>='A' && A[i]<='Z')
            // {
            //     return 1;
            // }
            // else if(A[i]>='0' && A[i]<='9')
            // {
            //     return 1;
            // }
        // }
        // return 0;
        for(int i=0;i<n;i++)
        {
            if(!Character.isLetterOrDigit(A[i]))
            {
                return 0;
            }
        }
        return 1;
    }
}
