
// 11. Write Program to check whether a number is EVEN or ODD using switch.

import java.util.Scanner;

class question11{

	public static void main(String[] args){
		int num;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		num = sc.nextInt();

		switch(num % 2){//this will return 0
			case 0:
				System.out.println(num + " is an Even number");
				break;
			case 1:
				System.out.println(num + " is an Odd number");
		}
		sc.close();
	}// End main

}// End question11 class