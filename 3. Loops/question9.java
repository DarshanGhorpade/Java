
// 9. Write a program to find the prime or not.

import java.util.Scanner;

class question9{

	public static void main(String[] args){
		int num, i, count=0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		num = sc.nextInt();
		
		if(num == 1 || num <= 0){
			System.out.println(num + " is not a Prime Number.");
		}
		else{
			for(i = 2; i < num; i++)
			{
			   if(num % i == 0)
			   {
				  count++;
				  break;
			   }
			}
			
			if(count == 0)
			   System.out.println(num + " is a Prime Number.");
			else
			   System.out.println(num + " is not a Prime Number.");
		}
		sc.close();
	}// End main

}// End question9 class