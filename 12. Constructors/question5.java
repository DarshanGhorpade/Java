// 5. Try to call the constructor multiple times with the same object


// There is no way to call same constructor multiple times with same object since constructor called only once at the time of object creation
// but we can call multiple constructors with same object at the time of its creation
class question5
{
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	question5()
	{
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	question5(int x)
	{
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	question5(int x, int y)
	{
		System.out.println(x * y);
	}

	public static void main(String args[])
	{
		// invokes default constructor first
		question5 q = new question5();
	}//End main
}//End question5 class
