// 4. Write two methods with the same name and same number of parameters of different type and call from main method

class question4{
    
    void sum (int a, int b){
        System.out.println(a + " + " + b + " = " +(a+b)) ;
    }
  
    void sum (float a, float b){
        System.out.println(a + " + " + b + " = " +(a+b));
    }
  
    public static void main (String[] args){
        question4  cal = new question4();
        cal.sum (8,5);      //sum(int a, int b) is method is called.
        cal.sum (4.6f, 3.8f); //sum(float a, float b) is called.
    }//End main
}//End question4 class
