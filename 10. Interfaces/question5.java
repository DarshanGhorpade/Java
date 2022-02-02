// 5. Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces in one class. Call the method.

interface A{
  void f();
}

interface B{
  void f();
}

class question5 implements A, B{   
  @Override
  public void f() {
    System.out.println("Override interface method");
  }

  public static void main(String... args){   
    question5 obj = new question5();
    obj.f();
  }//End main
}//End question5 class
