// 6. Matching a String Against a Regular Expression With matches()

public class question6
{
	public static void main(String[] args) {
        String Str = new String("Welcome to Java Programming");

        System.out.print("Return Value :" );
        System.out.println(Str.matches("(.*)Java(.*)"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Java"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Welcome(.*)"));
	}// End main
}// End question6 class
