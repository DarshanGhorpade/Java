// 2. Print the fields/instance members of the parent class using super

class Animal{  
    String color="white";  
}  
class Dog extends Animal{  
    String color="black";  

    void printColor(){  
        System.out.println(color);//prints color of Dog class  
        System.out.println(super.color);//prints color of Animal class  
    }  
}  

class question2{  
    public static void main(String args[]){  
        Dog d=new Dog();  
        d.printColor();  
    }//End main
}//End question2 class  
