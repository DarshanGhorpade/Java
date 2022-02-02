
// 4. Write a program to print the odd and even numbers.

import java.util.Scanner;

class question4{

	public static void main(String[] args){
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");  
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array elements one by one : ");
		for(int i=0;i<a.length;i++){  
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<a.length;i++){  
			System.out.print(a[i] + " ");
		}
		System.out.println("\nOdd Numbers in array :");  
		for(int i=0;i<a.length;i++){  
			if(a[i]%2!=0){  
				System.out.print(a[i] + " ");  
			}  
		}  
		System.out.println("\nEven Numbers in array :");  
		for(int i=0;i<a.length;i++){  
			if(a[i]%2==0){  
			System.out.print(a[i] + " ");  
			}
		}
		sc.close();
	}// End main

}// End question4 class