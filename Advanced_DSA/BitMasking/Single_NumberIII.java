package Advanced_DSA.BitMasking;

public class Single_NumberIII {
    public static void main(String[] args) {
        int arr[] = {10,8,8,9,12,9,6,11,10,6,12,17};
        int result[] = Singlrthree(arr);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static boolean checkIthBit(int A, int B)
    {
        int mask = 1<<B;
        if((A&mask)==0)
        {
            return false;
        }
        return true;
    }
    public static int[] Singlrthree(int arr[])
    {
        int n=arr.length;
        int xorall = 0;
        for(int i=0;i<n;i++)
        {
            xorall = xorall^arr[i];
        }
        int partition=0;
        for(int i=0;i<32;i++)
        {
            if(checkIthBit(xorall, i))
            {
                partition=i;
                break;
            }
        }
        int num1=0;
        int num2=0;
        // int res[] = new int[2];
        for(int i=0;i<n;i++)
        {
            if(checkIthBit(arr[i], partition))
            {
                num1 = num1^arr[i];
            }
            else
            {
                num2 = num2^arr[i];
            }
        }
        int res[] = new int[]{Math.min(num1, num2), Math.max(num1, num2)};
        return res;
    }
}
