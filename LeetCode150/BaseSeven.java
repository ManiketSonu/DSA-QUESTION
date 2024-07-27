package LeetCode150;

public class BaseSeven {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(BSeven(num));
    }
    public static String BSeven(int num)
    {
        if(num==0)
        {
            return "0";
        }
        StringBuilder s = new StringBuilder();
        boolean flag = (num<0);
        while(Math.abs(num)>0)
        {
            int digit = Math.abs(num)%7;
            s.insert(0, digit);
            num /=7;
        }
        if(flag)
        {
            s.insert(0, "-");
        }
        return s.toString();
    }
}
