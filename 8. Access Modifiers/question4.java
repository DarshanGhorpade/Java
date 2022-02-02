/*
    4. Create a class with PUBLIC fields and methods.
      Access the public methods and fields from any class in the same package or different
      package.
*/

package p1;

public class A
{
  public int count;
    
  public void display(){
		System.out.println("Count = "+ this.count);
	}

  public static void main(String[]args){
    A obj = new A();
    obj.count = 0;

    obj.display();
  }//End main
}//End class A


//question4.java

package p1;
public class question4 extends A{
    public static void main(String[] args){
        question4 obj = new question4();
	    obj.count = 0;
        obj.display();
    }//End main
}//End question4 class
