// 13. Write a program to generate NoSuchFieldException


import java.io.*;
import java.util.*;

public class question13{ 
    public static void main(String[] args){
        Set exampleleSet = new HashSet();  
        Hashtable exampleTable = new Hashtable();  
        exampleleSet.iterator().next();                         //This throws NoSuchElementException  
        exampleTable.elements().nextElement();      //as there are no elements in our Set  
                                                                                //and HashTable but we are trying to access the    
                                                                                          //elements.     
    }//End main
}//End question13 class
