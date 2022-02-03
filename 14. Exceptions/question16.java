// 16. Write a program to generate NumberFormatException

// Java program to demonstrate NullPointerException
class question16 {
public static void main(String args[]){
        try {
            // "abc" is not a number
            int num = Integer.parseInt("abc");
            System.out.println(num);
        }

		catch (Exception e) {
            e.printStackTrace();
		}
	}//End main
}//End question16 class
