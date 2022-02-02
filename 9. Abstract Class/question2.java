/*
  2. Create a sub class for an abstract class. Create an object in the child class for the
    abstract class and access the non-abstract methods
*/
//Abstract class with abstract and non-abstract methods.
abstract class Bike{  
  abstract void run();  
  void Break(){
        System.out.println("Break applied safely");
  }
}// End Bike  

class question2 extends Bike{  
    void run(){
        System.out.println("running safely");
    }  

    public static void main(String args[]){  
        Bike obj = new question2();
        //accessing abstract method
        obj.run();
        //accessing non-abstract method
        obj.Break();
    }// End main
}// End question2
