
// 17. Write a method to verify if the array contains two specified elements(12,23)

import java.util.Arrays;

class question17 {

    public static boolean result(int[] arr, int n1, int n2) {
        for (int number : arr) {
          boolean r = number != n1 && number != n2;
          if (r) {
                return false;
            }
         }
        return true;
    }

    public static void main(String[] args) {

        int[] a = {10, 12, 12, 23, 23, 77};
        System.out.println("Original Array: "+Arrays.toString(a)); 
        int num1 = 12;
        int num2 = 23;
        
        System.out.println("Result: "+result(a, num1, num2));
        
    }// End main

}// End question17 class