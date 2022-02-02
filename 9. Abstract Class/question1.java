// 1. Create an abstract class with abstract and non-abstract methods.

//Abstract class with abstract and non-abstract methods.
abstract class Bike{  
  abstract void run();  
  void Break(){
        System.out.println("Break applied safely");
  }
}// End Bike  

class question1 extends Bike{  
    void run(){
        System.out.println("running safely");
    }  

    public static void main(String args[]){  
        Bike obj = new question1();  
        obj.run();  
        obj.Break();
    }// End main
}// End question1  
