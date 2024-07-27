package LeetCode150;

public class nthdigit {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(Ndigit(n));
    }
    public static int Ndigit(int n)
    {
        long digit = 9;
        int length = 1;
        int first = 1;
        while(n>length*digit)
        {
            n = (int) (n-length*digit);
            length++;
            first = first*10;
            digit = digit*10;
        }
        first = first+(n-1)/length;
        String digitString = Integer.toString(first);
        return Character.getNumericValue(digitString.charAt((n-1)%length));
    }
}
