/*
  3. Create a class with PROTECTED fields and methods. Access these fields and methods
    from any other class in the same package.
    Also, Access the PROTECTED fields and methods from child class located in a different
    package
    Access the PROTECTED fields and methods from any class in different package
*/

package p1;

class A
{
  protected int count;
    
  protected void display(){
		System.out.println("Count = "+ this.count);
	}

  public static void main(String[]args){
    A obj = new A();
    obj.count = 0;

    obj.display();
  }// End main
}//End class A

package p1;
public class question3 extends A{
    public static void main(String[] args){
        question3 obj = new question3();
	      obj.count = 0;
        obj.display();
    }//End main
}// End question3 class


// C.java is in different package
package p2;
import p1.*;
public class C extends A{
    public static void main(String[] args){
        C obj = new C();
	    obj.count = 0;
        obj.display();
    }//End main
}//End class C
