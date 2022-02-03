// 15. Write a program to generate NullPointerException

class question15 {
public static void main(String args[])
	{
		try {
			String a = null; // null value
			System.out.println(a.charAt(0));
		}
		catch (NullPointerException e) {
            e.printStackTrace();
		}
	}//End main
}//End question15 class
