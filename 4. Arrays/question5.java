
// 5. Write a function to remove a specific element from an array

import java.util.Scanner;

class question5{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("\nEnter elements of array one by one : ");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Elements of array : ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}

		System.out.print("\nEnter Element to be deleted: ");
		int element = sc.nextInt();
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == element){
				// shift elements to the left
				for(int j = i; j < a.length - 1; j++){
					a[j] = a[j+1];
				}
				break;
			}
		}
		
		System.out.println("Array elements after deletion-- " );
		for(int i = 0; i < a.length - 1; i++){
			System.out.print(" " + a[i]);
		}  
		sc.close();
	}// End main

}// End question5 class