
// 7. Print the smaller and larger number

import java.util.Scanner;

class question7{

	public static void main(String[] args){

		int a, b;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
		b=sc.nextInt();

		if(a > b)
			System.out.println("Larger = " + a + "\nSmaller = " + b);
		else
		System.out.println("Larger = " + b + "\nSmaller = " + a);
	}// End main

}// End question7 class