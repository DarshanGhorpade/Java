// 1. Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. Call the private method in main method 
//    Create a sub class and try to access the private fields and methods from sub class.

// A.java

package p;
class A
{
    int count;
    
    void display(){
		System.out.println("Hello World");
	}
	
}

// question1.java

package p1;
public class question1 {
    public static void main(String args[]) {
        A obj = new A();
        
        obj.count = 0;
        
        obj.display();
    }// End main
}//End question1 class
