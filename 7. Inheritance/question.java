/*
A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third
method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main
method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above
process only for data members
*/


class A{
    int a = 10;

    void a1(){
        System.out.println("Class A First Method");
    }

    void a2(){
        System.out.println("Class A Second Method");
    }

    void Display(){
        System.out.println("This is Class A");
    }
}//End class A


class B extends A{
    int b = 20;

    void b1(){
        System.out.println("Class B First Method");
    }

    void b2(){
        System.out.println("Class B Second Method");
    }

    void Display(){
        System.out.println("This is Class B");
    }
}//End class B

class C extends B{
    int c = 30;

    void c1(){
        System.out.println("Class C First Method");
    }

    void c2(){
        System.out.println("Class C Second Method");
    }

    void Display(){
        System.out.println("This is Class C");
    }
}//End class C

public class question{
    public static void main(String[]args){
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.Display();
        obj1.a1();
        obj1.a2();

        obj2.Display();
        obj2.b1();
        obj2.b2();

        obj3.Display();
        obj3.c1();
        obj3.c2();
        System.out.println("a = "+obj3.a+" b = "+obj3.b+" c = "+obj3.c);

        A obj4 = new B();
        obj4.Display();

        A obj5 = new C();
        obj5.Display();


    }//End main
}//End question class
