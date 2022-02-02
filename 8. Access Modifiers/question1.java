// 1. Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. Call the private method in main method 
//    Create a sub class and try to access the private fields and methods from sub class.

package p1;

class A
{
  private int count;
    
  private void display(){
		System.out.println("Count = "+ this.count);
	}

  public static void main(String[]args){
    A obj = new A();
    obj.count = 0;

    obj.display();
  }//End main
}//End A class

package p1;
public class question2 extends A{
    public static void main(String[] args){
        question2 obj = new question2();
	      obj.count = 0;
        obj.display();
	      System.out.println("Count = "+obj.count);
    }//End main
}//End question2 class

/*
Here question2 is subclass of class A
If we try to access private fields and methods of superclass in subclass results in errors
 error: count has private access in A
            obj.count = 0;
               ^
 error: cannot find symbol
        obj.display();
           ^
  symbol:   method display()
  location: variable obj of type question2
*/
