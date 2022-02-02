
// 5. Write a program to print largest number among three numbers.

import java.util.Scanner;

class question5{

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter 1st number :");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number :");
		int b = sc.nextInt();
		System.out.print("Enter 3rd number :");
		int c = sc.nextInt();
  
		if ( a > b && a > c ){
		   System.out.println("Largest number is : "+ a);
		}else if ( b > a && b > c ){
		   System.out.println("Largest number is : "+ b);
		}else if ( c > a && c > b ){
		   System.out.println("Largest number is : "+ c);
		}else{
		   System.out.println("Three numbers are equal.");
		}
		sc.close();
	}// End main

}// End question5 class