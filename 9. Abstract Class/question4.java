// 4. Create an instance for the child class in child class and call non-abstract methods

abstract class Shape {

    //abstract method
    abstract void display();
    //non-abstract method    
    public void a(){
        System.out.println("Calling non-abstract method by child class object");
    }

}

public class question4 extends Shape {

    @Override
    public void display() { System.out.println("Child"); }

    public static void main(String[] args)
    {
        question4 obj = new question4();
        obj.display();
        obj.a();
    }//End main

}//End question4 class
