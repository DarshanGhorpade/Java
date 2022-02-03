/*
    3. Create a HashSet with at least 10 elements of type String
    Write program covering all the operations of HashSet
*/

import java.util.*;
 
public class question3 {
   public static void main(String args[]) {
        // Create an empty hash set by declaring object
        // of string type
        HashSet<String> cars = new HashSet<String>();

        //1. Insert value into set
        // using standard add() method
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Suzuki");
        cars.add("Skoda");
        cars.add("Honda");
        cars.add("Mahindra");
        cars.add("Tata");
         
        System.out.println("The Hashset is: "+cars);

        // 2. Fetch the value of a index
        // Converting HashSet to Array
        String[] car = cars.toArray(new String[cars.size()]);
  
        // Accessing elements by index
        System.out.println("Element at index 3 is: "+ car[3]);

        // 3. Create a clone/copy of HashSet
        //using clone() method  
        HashSet<String> clonedSet = new HashSet<String>();  
        //Clone the HashSet  
        clonedSet = (HashSet)cars.clone();  
        //Displaying the new Set after Cloning;  
        System.out.println("The new clone set elements: " + clonedSet);  

        // 4. Check if the given value is in the Set
        // Checking for the key_element '11'
        // Check for "BMW" in the set
        System.out.println("Does the Set contains 'BMW'? " + cars.contains("BMW"));
  
        // Check for "Ford" in the set
        System.out.println("Does the Set contains 'Ford'? " + cars.contains("Ford"));
  
        // 5. Check if the set is empty
        System.out.println("Is the set empty: " + cars.isEmpty());
        
        // 6. Print the size of the set to the console
        // using the method
        System.out.println("Size of the set is : "+ cars.size());

        // 7. Print all the values of set to the console
        // print HashSet elements one by one.
        // Inserton order in not preserved and it is based
        // on hash code of objects.
  
        // creates Iterator oblect.
        Iterator itr = cars.iterator();
  
        // check element is present or not. if not loop will
        // break.
        System.out.print("\nValues in hashset: ");
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        // 9. Remove a specific value
        String valueToRemove = "BMW";
        if (cars.remove(valueToRemove)) {
            System.out.println("\n"+valueToRemove + " is removed");
        } else {
            System.out.println("\nFailed to remove !");
        } 
        System.out.print("\nUpdated HashSet: "+cars);

    }//End main
}//End question3 class
