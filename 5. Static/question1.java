/*
    1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
       methods and a main method.
*/

class question1 {

    // 2 static variables
    static int id = 1;
    static String collegeName = "CollegeName";

    // 2 instance variables
    String name;
    int marks;

    // 2 static methods
    public static void increment() {
        id++;
    }

    public static String getCollegeName() {
        return collegeName;
    }

    // 2 instance methods
    void setName(String name){
        this.name = name;
    }

    void setMarks(int m){
        this.marks = m;
    }

    // main method
    public static void main(String[] args) {
        question1 obj1 = new question1();
        obj1.setName("Ramesh");
        obj1.setMarks(98);
        question1 obj2 = new question1();
        obj2.setName("Suresh");
        obj2.setMarks(95);

        System.out.println("Student Details are : ");
        System.out.println("ID" + "| " + "Name" + " |" + "College Name" + "|" + "Marks");        
        System.out.println(id + " |" + obj1.name + "|" + getCollegeName() + " |" + obj1.marks);
        increment();
        System.out.println(id + " |" + obj2.name + "|" + getCollegeName() + " |" + obj2.marks);

    }// End main

}// End question1 class