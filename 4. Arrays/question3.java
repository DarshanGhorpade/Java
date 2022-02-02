
// 3. Write a program to find the index of an array element

import java.util.Scanner;

class question3{

	// Linear-search function to find the index of an element
    public static int findIndex(int arr[], int t)
    {
 
        // if array is Null
        if (arr == null) {
            return -1;
        }
 
        // find length of array
        int len = arr.length;
        int i = 0;
 
        // traverse in the array
        while (i < len) {
 
            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
	}

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

		System.out.print("\nEnter element whose index to find : ");
		int element = sc.nextInt();

		int result = findIndex(a, element);

		if(result == -1)
			System.out.println("Element " + element + " is not present in array.");
		else
			System.out.println("Index position of " + element + " in array is: " + result);

		sc.close();
	}// End main

}// End question3 class