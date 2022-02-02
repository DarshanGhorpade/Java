

// 5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables.

// In Java, there is no concept of global variables; since Java is an Object-oriented programming language, everything is a part of the Class. But if we want to make a variable globally accessible, we can make it static by using a static Keyword.

class question5{

	// static variable  
   	static int a = 10;  
    
   	// non-static or local variable  
   	int b = 20; 

	public static void main(String[] args){

		question5 obj = new question5();

		// accessing the non-static(local) variable  
       		System.out.println("Value of non-static variable is: " + (obj.b));  
  
       		// accessing the static(global) variable  
       		System.out.println("Value of static variable is:" + (question5.a));
		
	}// End main

}// End question5 class