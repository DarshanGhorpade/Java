// 17. Write a program to generate StringIndexOutOfBoundsException

// Java program to demonstrate NullPointerException
class question17 {
public static void main(String args[]){
        try {
			String a = "This is like chipping "; // length is 22
			char c = a.charAt(24); // accessing 25th element
			System.out.println(c);
        }

		catch (Exception e) {
            e.printStackTrace();
		}
	}//End main
}//End question17 class
