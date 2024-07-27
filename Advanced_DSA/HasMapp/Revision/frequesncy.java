package Advanced_DSA.HasMapp.Revision;

import java.util.HashMap;

public class frequesncy {
    public static void main(String[] args) {
        int arr[] = {1,4,2,4,3,4,4};
        System.out.println(freMax(arr));
    }
    public static int freMax(int arr[])
    {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hs.containsKey(arr[i]))
            {
                hs.put(arr[i], 1);
            }
            else
            {
                hs.put(arr[i],hs.get(arr[i])+1);
            }
        }
        int maxfre = 0;
        int anskey = -1;
        for(var e:hs.keySet())
        {
            if(hs.get(e)>maxfre)
            {
                maxfre = hs.get(e);
                anskey = e;
            }
        }
        return anskey;
    }
}
