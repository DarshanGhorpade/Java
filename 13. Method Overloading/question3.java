// 3. Write two methods with the same name and same number of parameters of same type and call from main method

class question3 {
    
    void sum (int a, int b){
        System.out.println(a + " + " + b + " = " +(a+b)) ;
    }

    void sum (int a, int b){
        System.out.println(a + " + " + b + " = " +(a+b)) ;
    }
  
    public static void main (String[] args){
        question3 cal = new question3();
        cal.sum (8,5);      //compiler error
    }//End main
}//End question3 class


/*Error:  
        error: method sum(int,int) is already defined in class Main
               void sum (int a, int b){
                    ^
*/
