// 6. Create an interface with a default method and implement it in a class. Do not provide implementation to the default method and call the method.


interface A{
  default void f(){
      System.out.println("This is Java");
  }
}

class question6 implements A{   

  public static void main(String... args){   
    question6 obj = new question6();
    obj.f();
  }//End main
}//End question6 class
