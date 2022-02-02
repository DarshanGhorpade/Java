
// 12. Write a method to remove duplicate elements from an array

import java.util.Scanner;

class question12 {

    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
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

        size = removeDuplicateElements(a, size);

        System.out.println("\nElements of array after removing duplicates : ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }// End main

}// End question12 class