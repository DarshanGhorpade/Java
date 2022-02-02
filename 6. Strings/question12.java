// 11. Splitting strings with split()

public class question12
{
	public static void main(String[] args) {
        String s="Java is a very@ good programming language.";  
        String[] arrOfStr = s.split("@", 2);
 
        for (String a : arrOfStr)
            System.out.println(a);
	}//End main
}//End question12 class
