
// 3. Write a Program to equal operator and not equal operators

import java.util.Scanner;

class question3{

	public static void main(String[] args){
		//Scanner class object created
        Scanner sc = new Scanner(System.in);
        //Taking input of 2 numbers
        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //checking if two numbers are equal
        if(num1 == num2)
        {
            System.out.println("Two numbers "+ num1 + " & " + num2 + " are equal");
        }
        else
        {
            System.out.println("Two numbers "+ num1 + " & " + num2 + " are not equal");
        }
        sc.close();
	}// End main

}// End question3 class

