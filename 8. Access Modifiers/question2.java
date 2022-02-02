// 2. Create a class with DEFAULT fields and methods. Access these fields and methods from any other class in the same package

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
public class question1{
    public static void main(String[] args){
        A obj = new A();
	obj.count = 0;
        obj.display();
	System.out.println("Count = "+obj.count);
    }// End main
}//End question1 class
