package Interview.MountBlue;

public class OddEvenLengthString {
    public static void main(String[] args) {
        String str = "This is a sample string with various words";
        solve(str);
    }
    public static void solve(String str)
    {
        String words[] = str.split("\\s");
        int oddCount = 0;
        int evenCount = 0;
        for(String word: words)
        {
            int len = word.length();
            if(len%2==0)
            {
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("odd wala count "  + oddCount);
        System.out.println("Even wala count "  + evenCount);
    }
}
