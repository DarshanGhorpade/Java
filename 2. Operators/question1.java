
// 1. Write a function for arithmetic operators(+,-,*,/)

import java.util.Scanner;

class question1{

	int c;

	void addition(int x,int y)
	{
	 	c = x + y;
	}

	void substraction(int x,int y)
	{
	 	c = x - y;
	}

	void multiplication(int x,int y)
	{
	 	c = x * y;
	}

	void division(int x,int y)
	{
		if(y!=0)	
			c = x / y;
		else 
			c = -1;
	}

	public static void main(String[] args){

		int a,b;

		// Declare new Scanner class variable to accept inputs
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
		b=sc.nextInt();

		question1 r = new question1();

		r.addition(a,b);
		System.out.println("\n" + a + " + " + b + " = " + r.c);

		r.substraction(a,b);
		System.out.println(a + " - " + b + " = " + r.c);
		
		r.multiplication(a,b);
		System.out.println(a + " * " + b + " = " + r.c);
		
		r.division(a,b);		
		if(r.c != -1)
			System.out.println(a + " / " + b + " = " + r.c);						
		else
			System.out.println("Can't divide by zero!!!");
	}// End main

}// End question1 class