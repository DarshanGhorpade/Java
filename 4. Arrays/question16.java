
// 16. Write a function to get the difference of largest and smallest value

import java.util.Scanner;

class question16 {

    public static void difference(int arr[], int n){  
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("\nDifference between the largest and smallest values of the array: " + (max - min));	
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

        System.out.println("\nElements of array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        difference(a, size);

        sc.close();
    }// End main

}// End question16 class