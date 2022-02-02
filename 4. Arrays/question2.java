
// 2. Write a function to calculate the average value of an array of integers

import java.util.Scanner;

class question2{

	static Scanner sc = new Scanner(System.in);

	void addElementToArray(int a[], int n){
		System.out.println("Enter array elements one by one: ");
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
	}

	double average(int a[], int n){
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum += a[i];
		}
		double avg = sum / n;  
		return avg;
	}

	public static void main(String[] args){

		System.out.print("Enter size of array : ");
		int size = sc.nextInt();

		int a[] = new int[size];

		question2 r = new question2();
		r.addElementToArray(a, size);

		System.out.print("Elements of array : ");
		for(int i =0; i < size; i++){
			System.out.print(a[i] + " ");
		}

		double avg = r.average(a, size);
		System.out.format("\nThe average is: %.2f", avg);

		sc.close();

	}// End main

}// End question2 class