
// 18. Write a program to remove the duplicate elements and return the new array

import java.util.Scanner;

class question18 {

    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
  
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
  
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        return j;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter elements of array one by one : ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nElements of array before removing duplicates : ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        size = removeduplicates(a, size);

        System.out.println("\nElements of array after removing duplicates : ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }// End main

}// End question18 class