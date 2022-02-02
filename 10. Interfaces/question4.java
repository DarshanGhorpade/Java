// 4. Create two interfaces with one method each. Implement these two interfaces in one class.

interface A{
  void f1();
}

interface B{
  void f2();
}

class question4 implements A, B{   
  @Override
  public void f1() {  // from interface A
    System.out.println("Override first interface method");
  }

  @Override
  public void f2() {  // from interface B
    System.out.println("Override second interface method");
  }
  public static void main(String... args){   
    question4 obj = new question4();
    obj.f1();
    obj.f2();
  }//End main
}//End question4 class
