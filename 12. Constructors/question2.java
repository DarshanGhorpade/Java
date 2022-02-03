// 2. Call the constructors(both default and argument constructors) of super class from a child class

class Person{
   public String name;
   public int age;
   public Person(){
       name = "NA";
       age = 0;
   }
   public Person(String name, int age){
      this.name = name;
      this.age = age;
   }
   public void displayPerson() {
      System.out.println("\nData of the Person class: ");
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
   }
}

class Student extends Person {
   public String branch;
   public int Student_id;
   public Student(){
       super();
       branch = "NA";
       Student_id = 0;
   }
   public Student(String name, int age, String branch, int Student_id){
      super(name, age);
      this.branch = branch;
      this.Student_id = Student_id;
   }
   public void displayStudent() {
      System.out.println("\nData of the Student class: ");
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
      System.out.println("Branch: "+this.branch);
      System.out.println("Student ID: "+this.Student_id);
   }
}

public class question2{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.displayPerson();
        s1.displayStudent();

        Student s2 = new Student("Krishna", 20, "IT", 1256);
        s2.displayPerson();
        s2.displayStudent();
   }//End main
}//End question2
