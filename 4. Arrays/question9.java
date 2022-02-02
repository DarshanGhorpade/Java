
// 9. Write a function to reverse an array of integer values

import java.util.Scanner;

class question9 {

    // Function to insert x in arr at position pos
    public static int[] reverseArray(int n, int arr[]) {
        int i, j;

        // create a new array of size n
        int rev[] = new int[n];

        for(i = n, j = 0; i > 0 ; i--, j++){
            rev[j] = arr[i-1];
        }
        return rev;
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

        System.out.println("\nElements of array before reverse: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        a = reverseArray(size, a);
        
        System.out.println("\nElements of array after reverse: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }// End main

}// End question9 class