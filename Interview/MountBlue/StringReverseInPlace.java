package Interview.MountBlue;

public class StringReverseInPlace {
    public static void main(String[] args) {
        String str = "Maniket";
        System.out.println(solve(str));
    }
    public static String solve(String str)
    {
        int n = str.length();
        char ch[] = str.toCharArray();
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        return new String(ch);
    }
}
