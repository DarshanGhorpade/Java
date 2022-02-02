
// 7. Write a function to insert an element at a specific position in the array

import java.util.Scanner;

class question7 {

    // Function to insert x in arr at position pos
    public static int[] insertElement(int n, int arr[], int x, int pos) {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
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

        System.out.print("\nEnter the element which you want to insert : ");
        int element = sc.nextInt();

        System.out.print("\nEnter the position where you want to insert element : ");
        int position = sc.nextInt();

        a = insertElement(size, a, element, position);

        System.out.println("\nElements of array after adding element : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }// End main

}// End question7 class