package Stringss;

public class Count_SubString_Vowell {
    public static void main(String[] args) {
        String A="ABEC";
        System.out.println(countString(A));
    }
    public static int countString(String A)
    {
        int n=A.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(isVowel(A.charAt(i)))
                {
                    count++;
                }
            }
        }
        return count;
        // int n = A.length();
        // int count = 0;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         if (isVowel(A.charAt(i))) {
        //             count++;
        //         }
        //     }
        // }

        // return count;
    }
    public static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        else {
            return false;
        }
    }
}
