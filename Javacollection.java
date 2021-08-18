import java.util.*;
import java.io.*;
public class Javacollection {
    public static void main(String args[])
     {
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println( numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

         System.out.println("New HashMap: " + numbers.toString()); 
        numbers.replace("two", 100);
         System.out.println("New HashMap: " + numbers.toString());
        System.out.println("Entries: " + numbers.entrySet());
        HashMap<String, Integer> map 
        = new HashMap<>(); 
    map.put("a", 100); 
    map.put("b", 300); 
    map.put("c", 300); 
    map.put("d", 400); 

    // print map details 
    System.out.println("HashMap: "
                       + map.toString()); 

    // provide value for the key which has 
    // to replace it's current value, 
    // using replace(K key, V value) method 
    map.replace("b", 200); 

    // print new mapping 
    System.out.println("New HashMap: "
                       + map.toString()); 

}
}