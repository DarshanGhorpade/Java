
// 15. Write a method to find number of even number and odd numbers in an array

import java.util.Scanner;

class question15 {

    public static void evenOddElements(int arr[], int n){  
        int even[] = new int[n]; 
        int odd[] = new int[n];
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i < n; i++ ){
            if(arr[i] % 2 == 0){
                even[evenCount++] = arr[i];                
            }
            else{
                odd[oddCount++] = arr[i];
            }
        }
        System.out.println("\nEven numbers in array is : ");
        for(int i = 0; i < even.length; i++){
            if(even[i] == 0)
                break;
            System.out.print(even[i] + " ");

        }
        System.out.println("\nOdd numbers in array is : ");
        for(int i = 0; i < odd.length; i++){
            if(odd[i] == 0)
                break;
            System.out.print(odd[i] + " ");
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

        evenOddElements(a, size);

        sc.close();
    }// End main

}// End question15 class