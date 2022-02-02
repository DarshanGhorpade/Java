// 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

public class question8
{
	public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = "halo";
        String str5 = "Compare this String";
        //returns true as case is ignored
        System.out.println("str1.equalsIgnoreCase(str3)- " + str1.equalsIgnoreCase(str3));

        // returns true
        System.out.println("str5.startsWith(\"Compare\"): " + str5.startsWith("Compare"));
        // returns false
        System.out.println("str5.startsWith(\"Comparison\"): " + str5.startsWith("Comparison"));
        // returns true- Comparison starts from index 8
        System.out.println("str5.startsWith(\"this\"): " + str5.startsWith("this", 8));
        
        // returns true
        System.out.println("str5.endsWith(\"String\"): " + str5.endsWith("String"));
        // returns false
        System.out.println("str5.endsWith(\"Sting\"): " + str5.endsWith("Sting"));
        
        // returns 0
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        // returns positive integer
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str3));
        // returns negative integer
        System.out.println("str4.compareTo(str1): " + str3.compareTo(str1));
	}//End main
}//End question8 class
