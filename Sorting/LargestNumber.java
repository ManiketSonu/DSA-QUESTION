package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {3, 30, 34, 5, 9};
        System.out.print(LaNumber(arr));
    }
    public static String LaNumber(int arr[])
    {
        String[] str = new String[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            str[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str, new MyComparator());
        if(str[0].equals("0"))
        {
            return "0";
        }
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length;i++)
        {
            s.append(str[i]);
        }
        return s.toString();
    }
    private static class MyComparator implements Comparator<String>
    {
        @Override
        public int compare(String a, String b) {
            String ab = a+b;
            String ba = b+a;
            return ba.compareTo(ab);
        }
    }  
}
