// 4. Call argument constructor of current class using this()

class A{  
    A(){  
        this(5);  
        System.out.println("hello a");  
    }  
    A(int x){  
        System.out.println(x);  
    }  
} 

class question4{  
    public static void main(String args[]){  
        A a=new A();  
    }//End main
}//End question4 class  
