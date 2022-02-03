// 5. Write a program to throw exception with your own message

class question5 {
public static void main(String args[]){
      try {
          int a = 30, b = 0;
          int c = a / b; // cannot divide by zero
          System.out.println("Result = " + c);
      }
      catch (Exception e) {
          System.out.println("ERROR: Divide by zero is illegal!!");
      }
	}//End main
}//End question5 class
