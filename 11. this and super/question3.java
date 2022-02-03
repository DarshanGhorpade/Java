// 3. Call constructor of the current class using this()

class A{  
    A(){
        System.out.println("hello a");
    }  
    A(int x){  
        this();  
        System.out.println(x);  
    }  
}  

class question3{  
    public static void main(String args[]){  
        A a=new A(10);  
    }//End main
}//End question3 class  
