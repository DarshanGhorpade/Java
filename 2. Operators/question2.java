

// 2. Write a method for increment and decrement operators(++, --).

import java.util.Scanner;

class question2{
	int c;

	void increment(){
		c++;	// OR ++c;
	}

	void decrement(){
		c--;	// OR --c;
	}

	public static void main(String[] args){

		question2 r = new question2();

		// Declare new Scanner class variable to accept inputs
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		r.c = sc.nextInt();		
		System.out.println("Number before increment: " + r.c);
		r.increment();
		System.out.println("Number after increment: " + r.c);
		System.out.println("Number before decrement: " + r.c);		
		r.decrement();
		System.out.println("Number after decrement: " + r.c);
	}// End main

}// End question2 class