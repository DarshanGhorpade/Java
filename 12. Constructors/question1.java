/*
    1. Write a class with a default constructor, one argument constructor and two argument
    constructors. Instantiate the class to call all the constructors of that class from a main
    class
*/

class A {
    int a, b;
    
    A(){
        a = 0;
        b = 0;
    }
    A(int x){
        a = x;
    }
    A(int x, int y){
        a = x;
        b = y;
    }
    
    void display(){
        System.out.println("a = "+this.a+" b = "+this.b);
    }
}



public class question1{
        public static void main(String args[]) {
            A obj1 = new A();
            obj1.display();
            A obj2 = new A(1);
            obj2.display();
            A obj3 = new A(2,3);
            obj3.display();
        }//End main
 }//End question1 class
