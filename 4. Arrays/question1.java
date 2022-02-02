
// 1. Write a function to add integer values of an array

import java.util.Scanner;

class question1{

	static Scanner sc = new Scanner(System.in);

	void addElementToArray(int a[], int n){
		System.out.println("Enter array elements one by one: ");
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
	}

	public static void main(String[] args){

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int a[] = new int[size];

		question1 r = new question1();
		r.addElementToArray(a, size);

		System.out.print("Elements of array : ");
		for(int i =0; i < size; i++){
			System.out.print(a[i] + " ");
		}

		sc.close();
	}// End main

}// End question1 class