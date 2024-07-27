package Advanced_DSA.HasMapp.Revision;

import java.util.HashMap;

public class MostFrequesntEvenElement {
    public static void main(String[] args) {
        int arr[] = {29,47,21,41,13,37,25,7};
        System.out.println(mfreElement(arr));
    }
    public static int mfreElement(int arr[])
    {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int mfre = 0;
        int mfreeven = -1;
        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i];
            if(num%2==0)
            {
                int freq;
                if(hs.containsKey(num))
                {
                    freq = hs.get(num)+1;
                }
                else
                {
                    freq = 1;
                }
                hs.put(num,freq);
                if(freq>mfre || (freq==mfre && num<mfre))
                {
                    mfre = freq;
                    mfreeven = num;
                }
            }
        }
        return mfreeven;
    }
}
