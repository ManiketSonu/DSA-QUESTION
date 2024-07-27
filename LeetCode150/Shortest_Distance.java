package LeetCode150;

public class Shortest_Distance {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int res[] = SDistance(s, c);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] SDistance(String s, char c)
    {
        int n  = s.length();
        int ouputarr[] = new int[n];
        int cposotion = -n;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            {
                cposotion = i;
            }
            ouputarr[i] = i-cposotion;
        }

        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==c)
            {
                cposotion = i;
            }
            ouputarr[i] = Math.min(ouputarr[i],Math.abs(i-cposotion));
        }
        return ouputarr;
    }
}
