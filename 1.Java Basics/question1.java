// 1. How to create a class, object, method and its signature

/*
    class: Classes are the blueprint of your program. It is the place where you define variables, methods, constructors, blocks, interfaces and program logic. 
           Once classes are completed you can use it many times by creating its alias name or objects. 

    Create class:
    You can define class with class keyword as follow:
        public class MyClass
       
    Object:
    An object is an alias of the class which represents class behavior. A class may have many objects with different names. You can define objects as follow:
        Class_Name object_name=new Class_Name();
        
    Method(OR Function) and its signature:
    A method of function is a basic building block of program which contains set of code and referred to by a name. 
    A method is created inside class and can be accessed anywhere in program directly by name or followed by its class name.

    How to define method?
    It is very easy to define method in java. You can write method as follow:

        public void myname()
        {
        //code block
        }

        Or 

        public String myname()
        {
        //code block
        Return String_Value
        }

*/

// Example

class question1
{
  public static void main(String[] args)
  {
    int result;
    
    //Creating Calculator Object
    Calculator calc=new Calculator();
    //Calling Add() method
    result=calc.Add(12,18);
    
    //Creating PrintData Class Object
    PrintData pdata=new PrintData();
    //Calling print() method
    pdata.print(result);
  }//End main
}//End question1 class

//Defining Class Calculator
class Calculator
{
  public int Add(int num1, int num2)
  {
    System.out.println("Calculator Class Started...");
    return num1 + num2;
  }
}

//Defining Class PrintData
class PrintData
{
  public void print(int value)
  {
    System.out.println("PrintData Class Started.. ");
    System.out.println(value);
  }
}
