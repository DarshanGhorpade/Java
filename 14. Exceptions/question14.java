// 14. Write a program to generate NoSuchMethodException

// Java Program to illustrate
// NoSuchMethodException
class question14 {
    public question14{
		Class i;
		try {
			i = Class.forName("java.lang.String");
			try {
				Class[] p = new Class[5];
			}
			catch (SecurityException e) {
				e.printStackTrace();
			}
			catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

    public static void main(String[] args){
		new question14();
	}//End main
}//End question14 class
