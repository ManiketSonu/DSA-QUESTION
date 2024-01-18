package Stringss;

public class Delete_Alternate {
    public static void main(String[] args) {
        String str = "maniket";
        String rez = Alternate(str);
        System.out.println(rez);
    }
    public static String Alternate(String str)
    {
        int n=str.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i=i+2)
        {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}
