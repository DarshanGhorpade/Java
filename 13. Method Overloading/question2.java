// 2. Write two methods with the same name but different number of parameters of different data type and call the methods from main method

class question2{
    
    void sum (int a, int b){
        System.out.println(a + " + " + b + " = " +(a+b)) ;
    }
  
    void sum (float a, float b, float c){
        System.out.println(a + " + " + b + " + " + c + " = " +(a+b+c));
    }
  
    public static void main (String[] args){
        question2  cal = new question2();
        cal.sum (8,5);      //sum(int a, int b) is method is called.
        cal.sum (4.6f, 3.8f, 1.6f); //sum(float a, float b, float c) is called.
    }//End main
}//End question2 class
