// 3. Use Interface instances to call the implemented method in the implemented class

interface A{
	void fun();
}

class question3 implements A{
	public void fun(){
		System.out.println("fun()");
	}
  
  public static void main(String[] args){
		A b = new A();
		b.fun();
	}//End main
}//End question3 class

// Error will occur
// error: A is abstract; cannot be instantiated
//		A b = new A();
//		      ^
