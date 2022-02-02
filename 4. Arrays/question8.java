
// 8. Write a function to find the minimum and maximum value of an array

import java.util.Scanner;

class question8 {

    public static void FindMaxMinElement(int n, int arr[]) {
        // assign first array element to two variables
        int max = arr[0];
        int min = arr[0];
        // iterate and compare from array index 1
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("\nMaximum number = " + max + "\nMinimum number = " + min);		
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("\nEnter elements of array one by one : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nElements of array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        FindMaxMinElement(size, a);

        sc.close();
    }// End main

}// End question8 class