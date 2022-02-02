
// 11. Write a program to find the common values between two arrays

import java.util.Scanner;

class question11 {

    public static void findCommonElements(int n, int arr1[], int m, int arr2[]) {
        System.out.println("\nCommon Elements of two arrays are : ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(arr1[i] == arr2[j]){                 
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int size1 = sc.nextInt();

        int a1[] = new int[size1];

        System.out.println("Enter elements of array one by one : ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("\nElements of array 1 : ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }

        System.out.print("\nEnter size of array 2: ");
        int size2 = sc.nextInt();

        int a2[] = new int[size2];

        System.out.println("\nEnter elements of array one by one : ");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        System.out.println("Elements of array 2 : ");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }

        findCommonElements(size1, a1, size2, a2);

        sc.close();
    }// End main

}// End question11 class