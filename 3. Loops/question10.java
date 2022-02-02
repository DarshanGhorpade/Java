
// 10. Write a program to palindrome or not.

import java.util.Scanner;

class question10{

	public static void main(String[] args){
		int r, sum = 0, temp;    
		int num;//It is the number variable to be checked for palindrome  
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		num = sc.nextInt();

		temp = num;    
		while(temp > 0){    
		 	r = temp % 10;  //getting remainder  
		 	sum = (sum * 10) + r;    
		 	temp = temp/10;    
		}    
		if(num == sum)    
		 System.out.println(num + " is palindrome number.");    
		else    
		 System.out.println(num + " is not palindrome."); 

		sc.close();
	}// End main

}// End question10 class