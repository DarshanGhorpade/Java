
// 12. Write a program to print gender (Male/Female) program according to given M/F using switch.

import java.util.Scanner;

class question12{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter M or F : ");
		char c = sc.next().charAt(0);

		switch(c){ 
			case 'm':
			case 'M': 
				System.out.println("Gender is male"); 
				break; 
			case 'f':
			case 'F': 
				System.out.println("Gender is female"); 
				break; 
		}
		sc.close();
	}// End main

}// End question12 class