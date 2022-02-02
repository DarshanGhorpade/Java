
// 19. Write a function to find the missing number of sorted array of 1 to 100

import java.util.Arrays;
import java.util.Scanner;

class question19 {

    public static void findMissingElement(int arr[], int max){  
        Arrays.sort(arr);
        int currentValue = 1;
        for (int i = 0; i < arr.length; i++) {
              //6
            if (arr[i] != currentValue) {
                for (int j = currentValue; j < arr[i]; j++) {
                    System.out.println("\nMissing number in sorted array is : " + j);
                }
            }
            currentValue = arr[i] + 1;
        }
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

        int max = a[0];

        for (int i = 0; i < size; i++) {
            if(a[i] > max)
                max = a[i];
        }

        findMissingElement(a, max);

        sc.close();
    }// End main

}// End question19 class