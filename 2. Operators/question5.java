

// 5. Programs on Logical AND,OR operator and Logical NOT

class question5{

	public static void main(String[] args){

		boolean x = true, y = false, z;

		// Logical AND
		z = x&&y;
		System.out.println("x && y = " + z);	// will print false

		// Logical OR
		z = x||y;
		System.out.println("x || y = " + z);	// will print true

		// Logical NOT
		z = !x;
		System.out.println("!x = " + z);	// will print false

	}// End main

}// End question5 class