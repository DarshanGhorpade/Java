// 3. Write a method which throws exception, Call that method in main class without try block

// Java program to demonstrate NullPointerException
class question3 {
    public static int div(int a, int b) throws ArithmeticException{
        return a/b;
    }
    
    public static void main(String args[]){
        try {
            int a = 30, b = 0;
            int c = div(a,b); // cannot divide by zero
            System.out.println("Result = " + c);
        }
		catch (Exception e) {
            e.printStackTrace();
		}
	}//End main
}//End question3 class
