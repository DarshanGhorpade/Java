// 1. Write two methods with the same name but different number of parameters of same type and call the methods from main method

class Adder{  
    static int add(int a,int b){
        return a+b;
    }  
    static int add(int a,int b,int c){
        return a+b+c;
    }  
}  
class question1{  
   public static void main(String[] args){  
        System.out.println(Adder.add(11,11));  
        System.out.println(Adder.add(11,11,11));  
    }//End main
}//End question1 class  
