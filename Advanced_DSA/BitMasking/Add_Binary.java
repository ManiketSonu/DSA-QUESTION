package Advanced_DSA.BitMasking;

public class Add_Binary {
    public static void main(String[] args) {
        String A = "1010";
        String B = "1011";
        System.out.println(AddBinary(A, B));
    }
    public static String AddBinary(String A, String B)
    {
        int alen = A.length();
        int blen = B.length();
        int i = 0;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while(i<alen || i<blen || carry!=0)
        {
            int x=0;
            if(i<alen && A.charAt(alen-i-1)=='1')
            {
                x=1;
            }
            int y=0;
            if(i<blen && B.charAt(blen-i-1)=='1')
            {
                y=1;
            }
            ans.insert(0, (char) ((x + y + carry) % 2 + '0'));
            carry = (x+y+carry)/2;
            i = i+1;
        }
        return ans.toString();
    }
}
