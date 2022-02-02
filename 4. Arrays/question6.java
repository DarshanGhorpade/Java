
// 6. Write a function to copy an array to another array

import java.util.Scanner;

class question6{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("\nEnter elements of array one by one : ");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("\nElements of source array : ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}

        int b[] = new int[a.length];

		for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }

		System.out.println("\nElements of target array : ");
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}  
		sc.close();
	}// End main

}// End question6 class