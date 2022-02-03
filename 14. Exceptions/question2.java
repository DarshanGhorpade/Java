// 2. Handle the Arithmetic exception using try-catch block
class question2 {
public static void main(String args[]){
      try {
          int a = 30, b = 0;
          int c = a / b; // cannot divide by zero
          System.out.println("Result = " + c);
      }
      catch (Exception e) {
          e.printStackTrace();
      }
	}//End main
}//End question2 class
