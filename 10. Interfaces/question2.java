// 2. Create an interface with two methods, but implement only one in a class. Call the method implemented.

// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class question2 {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
  }//End main
}//End question2 class

// will not compile
// Error will occur: error: Pig is not abstract and does not override abstract method sleep() in Animal
