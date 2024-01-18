package Stringss;

public class Max_Occurence_Char {
    public static void main(String[] args) {
        String line = "testsample";
        
        System.out.println(Occureing(line));
    }
    public static char Occureing(String line)
    {
        int n=line.length();
        for(int i=0;i<n-1;i++)
        {
            if(line.charAt(i)==line.charAt(i+1))
            {
                return line.charAt(i);
            }
        }
        return 0;
    }
}
