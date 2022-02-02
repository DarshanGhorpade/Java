
// 4. Write a program to find the two numbers equal or not.

import java.util.Scanner;

class question4{

	public static void main(String[] args){

		// Declare new Scanner class variable to accept inputs		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		// equals operator
		if(a == b){
		System.out.println("The two numbers are equal.");
		}
		// not equal operator
		else if(a != b){
		System.out.println("The two numbers are not equal.");
		}

	}// End main

}// End question4 class