// 5. Write two methods with the same name, number of parameters and data type but different return Type.

/*
    You cannot declare two methods with the same signature and different return type. 
    It will throw a compile-time error. 
    If both methods have the same parameter types, but different return type, then it is not possible. 
*/

class question5{
    
    int sum (int a, int b){
        //System.out.println(a + " + " + b + " = " +(a+b)) ;
        int result = a + b;
        return result;
    }
  
    float sum (int a, int b){
        //System.out.println(a + " + " + b + " = " +(a+b));
        float result = a + b;
        return result;
    }
  
    public static void main (String[] args){
        question5  cal = new question5();
        int a = cal.sum (8,5);      //compile time error
        System.out.println("sum = " +a) ;
    }//End main
}//End question5 class

/*
  Error:
         error: method sum(int,int) is already defined in class Main
            float sum (int a, int b){
                  ^
*/
