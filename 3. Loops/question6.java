

// 6. Write a program to print even number between 10 and 100 using while

class question6{

	public static void main(String[] args){
		int i = 10, number = 100;  
		System.out.println("List of even numbers from " + i + " to " + number + " : ");  
		while(i <= number){  
			//logic to check if the number is even or not  
			//if i%2 is equal to zero, the number is even  
			if (i%2 == 0){  
				System.out.print(i + " ");  
			}
			i++;
		}  
	}// End main

}// End question6 class