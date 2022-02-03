// 1. Print the fields/instance members of the current class using this and without using object

class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
        this.rollno=rollno;  
        this.name=name;  
        this.fee=fee;  
    }  
    void display(){
        System.out.println(this.rollno+" "+this.name+" "+this.fee);
    }  
}  
  
class question1{  
    public static void main(String args[]){  
        Student s1=new Student(111,"ankit",5000f);  
        Student s2=new Student(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
    }//End main
}//End question1 class
