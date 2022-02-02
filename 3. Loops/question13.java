
// 13. Write a program for multiple if else statement(Largest number in 10,20 and 30)

class question13{

	public static void main(String[] args){
		int a = 10, b = 20, c = 30; 
		if ( a > b && a > c ){
		   System.out.println("Largest number is : "+ a);
		}else if ( b > a && b > c ){
		   System.out.println("Largest number is : "+ b);
		}else if ( c > a && c > b ){
		   System.out.println("Largest number is : "+ c);
		}else{
		   System.out.println("Three numbers are equal.");
		}
	}// End main

}// End question13 class