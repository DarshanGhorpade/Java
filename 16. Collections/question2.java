 /*
    2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
    1. Insert a Key value mapping into the map
    2. Fetch the value of a Key
    3. Create a clone/copy of HashMap
    4. Check if the given Key is in the Map
    5. Check if the value is in the Map
    6. Check if the map is empty
    7. Print the size of the Map to the console
    8. Print all the Keys of the map to the console
    9. Print all the Keys of the map to the console
    10. Remove a specific Key-value pair
    11. Copy all the elements of the Map to another Map
*/

import java.util.*;
 
public class question2 {
   public static void main(String args[]) {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<Integer, String> map = new HashMap<>();

        //1. Insert a Key value mapping into the map
        // using standard put() method
        map.put(10, "Vishal");
        map.put(11, "Sachin");
        map.put(12, "Vaibhav");
        // Print size and content of the Map
        System.out.println("Size of map is:- "+ map.size());
        // Printing elements in object of Map
        System.out.println(map);

        // 2. Fetch the value of a Key
        if (map.containsKey(10)) {
 
            // Mapping
            String s = map.get(10);
 
            // Printing value fr the corresponding key
            System.out.println("Fetch value for key "+ " \"10\" is:- " + s);
        }

        // 3. Create a clone/copy of HashMap
        //using clone() method  
        System.out.println("The cloned map looks like this: "+ map.clone()); 

        // 4. Check if the given Key is in the Map
        // Checking for the key_element '11'
        System.out.println("Is the key '11' present? "+ map.containsKey(11));
  
        // Checking for the key_element '5'
        System.out.println("Is the key '5' present? "+ map.containsKey(5));

        // 5. Check if the value is in the Map
        // Checking for the Value 'Geeks'
        System.out.println("Is the value 'Vishal' present? " + map.containsValue("Vishal"));
  
        // Checking for the Value 'World'
        System.out.println("Is the value 'Vinay' present? " + map.containsValue("Vinay"));

        // 6. Check if the map is empty
        // check if map is empty
        boolean val = map.isEmpty();

        // check the boolean value
        System.out.println("Is map empty: " + val);

        // 7. Print the size of the Map to the console
        // using the method
        System.out.println("Size of the map is : "+ map.size());

        // 8. Print all the Keys of the map to the console
        // Using an iterator
        System.out.print("Keys of map are: ");        
        Iterator<Integer> i1 = map.keySet().iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next()+" ");
        }
        // 9. Print all the values of the map to the console
        // Using an iterator
        System.out.print("\nValues of map are: ");        
        Iterator<String> i2 = map.values().iterator();
        while (i2.hasNext()) {
            System.out.print(i2.next()+" ");
        }

        // 10. Remove a specific Key-value pair
        map.remove(10);
        System.out.print("\nUpdated HashMap: "+map);

        // 11. Copy all the elements of the Map to another Map
        // Creating a new hash map and copying
        HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
        new_hash_map.putAll(map);
  
        // Displaying the final HashMap
        System.out.print("\nThe new map looks like this: " + new_hash_map);

    }//End main
}//End question2 class
