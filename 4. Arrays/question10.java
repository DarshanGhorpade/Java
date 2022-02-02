
// 10. Write a function to find the duplicate values of an array

import java.util.Scanner;

class question10 {

    public static void findDuplicate(int n, int arr[]) {
        System.out.println("\nDuplicate Elements of array : ");
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.print(arr[j] + " ");
                }
            }
        }
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

        findDuplicate(size, a);

        sc.close();
    }// End main

}// End question10 class