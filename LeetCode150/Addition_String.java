package LeetCode150;

public class Addition_String {
    public static void main(String[] args) {
        String nums1 = "123";
        String nums2 = "11";
        System.out.println(addString(nums1, nums2));
    }
    public static String addString(String nums1, String nums2)
    {
        int n  = nums1.length()-1;
        int m  = nums2.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int base  = 10;
        while(n>=0 || m>=0)
        {   
            int s = 0;
            int s1 = 0;
            int s2 = 0;
            if(n>=0)
            {
                s1 = nums1.charAt(n)-48;
                n--;
            }
            if(m>=0)
            {
                s2 = nums2.charAt(m)-48;
                m--;
            }
            s = s1+s2+carry;
            if(s>=base)
            {
                carry = 1;
                s = s-base;
            }
            else
            {
                carry = 0;
            }
            res.append(s);
        }
        if(carry==1)
        {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
