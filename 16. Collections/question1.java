/*
    Q1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList and perform the below operations
    1. Add an element to the ArrayList
    2. Iterate through the ArrayList by using Iterator object
    3. Add an element at a specific index
    4. Remove an element from the ArrayList, Remove at an index
    5. Update the element at a specific index
    6. Check the element is present at a particular index
    7. Get an element at a particular index
    8. Find out the size of the ArrayList
    9. Check the given element is present in the ArrayList
    10. Remove all elements of the ArrayList
*/

import java.util.*;
 
public class question1 {
   public static void main(String args[]) {
        //create and initialize ArrayList object myList with Arrays.asList method
        ArrayList<String> myList = new ArrayList<String>(
        Arrays.asList("One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten"));
        //print the ArrayList
        System.out.println("List contents:"+myList);

        //1. Add an element to the ArrayList
        myList.add("Eleven");
        //print the ArrayList
        System.out.println("List contents(adding element):"+myList);

        //2. Iterate through the ArrayList by using Iterator object
        Iterator i = myList.iterator();
        System.out.println("The ArrayList elements using iterator are:");
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

        //3. Add an element at a specific index
        myList.add(2,"Zero");
        //print the ArrayList
        System.out.println("\nList contents(adding element at specific index):"+myList);

        //4. Remove an element from the ArrayList, Remove at an index
        System.out.println("Removing element");
        myList.remove("Eleven");
        //print the ArrayList
        System.out.println("List contents(removing element from end):"+myList);
        System.out.println("Removing element at index = 2 ");
        myList.remove(2);
        //print the ArrayList
        System.out.println("List contents(removing element at specific index):"+myList);

        //5. Update the element at a specific index
        System.out.println("Updating element at index = 1 ");
        myList.set(1,"Zero");
        //print the ArrayList
        System.out.println("List contents(updating element at specific index):"+myList);

        //6. Check the element is present at a particular index
        int index = 4;
        if(myList.indexOf("Five") == index)
            System.out.println("The Five is present in ArrayList at index " + index);
        else
            System.out.println("The Five is absent in ArrayList at index " + index);
        //7. Get an element at a particular index
        String element = myList.get(2);
        System.out.println("The element at index 2 is "+element);

        //8. Find out the size of the ArrayList
        System.out.println("The size of the ArrayList is: " + myList.size());

        //9. Check the given element is present in the ArrayList
        System.out.println("The element Five is available in ArrayList? " + myList.contains("Five"));
        System.out.println("The element Twenty is available in ArrayList? " + myList.contains("Twenty"));

        //10. Remove all elements of the ArrayList
        myList.removeAll(myList); 
        System.out.println("ArrayList after removing all elements: ");
        //print the ArrayList
        System.out.println("List contents:"+myList);
    }//End main
}//End question1 class
