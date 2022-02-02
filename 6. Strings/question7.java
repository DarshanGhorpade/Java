// 7. Comparing strings using the methods equals(),

public class question7
{
	public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = new String("Java Programming");
        String str3 = new String("Java Programming");
        String str4 = "Java";
        System.out.println(str1.equals(str3)); //true
        System.out.println(str2.equals(str3)); //true
        System.out.println(str1.equals(str4)); //false
	}// End main
}// End question7 class
