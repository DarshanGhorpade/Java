// 3. Create an instance for the child class in child class and call abstract methods

abstract class Shape {

    abstract void display();

}

public class question3 extends Shape {

    @Override
    public void display() { System.out.println("Child"); }

    public static void main(String[] args)
    {
        question3 obj = new question3();
        obj.display();

    }//End main

}//End question3 class
