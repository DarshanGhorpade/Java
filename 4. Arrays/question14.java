
// 14. Write a method to find the second largest number in an array

import java.util.Scanner;

class question14 {

    public static void secondLargestElement(int arr[], int n){  
        int temp;
        for(int i = 0; i < n; i++ ){
            for(int j = i+1; j < n; j++){
   
               if(arr[i] > arr[j]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
               }
            }
        }
        System.out.println("\nSecond largest number in array is : "+arr[n - 2]);
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

        secondLargestElement(a, size);

        sc.close();
    }// End main

}// End question14 class