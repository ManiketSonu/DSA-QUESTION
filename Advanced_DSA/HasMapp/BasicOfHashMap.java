package Advanced_DSA.HasMapp;

import java.util.HashMap;
import java.util.Map.Entry;

public class BasicOfHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();
        //Adding element
        hs.put("Sonu", 24);
        hs.put("Ravi", 22);
        hs.put("Ved", 3);
        hs.put("Nangu", 5);
        hs.put("Mangu", 0);

        //Getting value of a key from HashMap
        System.out.println(hs.get("Sonu"));
        System.out.println(hs.get("Maniket"));

        //cahngin and updating the value
        hs.put("Ved", 2);
        System.out.println(hs.get("Ved"));

        //Remove element from the hasmap
        System.out.println(hs.remove("Sonu"));

        //checking if a key is in the Hashmap
        System.out.println(hs.containsKey("Sonu"));
        System.out.println(hs.containsKey("Mangu"));

        //Adding a new entry in hasmap
        hs.putIfAbsent("Manshi", 22);
        hs.putIfAbsent("Nangu", 5);

        //Get all the key in hasmap
        System.out.println(hs.keySet());

        //Get all the values in hashmap
        System.out.println(hs.values());

        //Get all the entry in hasmap
        System.out.println(hs.entrySet());

        //Traversing all the entries if hashmap
        for(String key:hs.keySet())
        {
            System.out.printf(key,hs.get(key));
        }
        //or
        for(Entry<String, Integer> e:hs.entrySet())
        {
            System.out.printf(e.getKey(),e.getValue());
        }
    }
}
