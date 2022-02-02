// 1. Create an interface with only one method and implement it in a class. Call the method implemented.

// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
}


// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class question1 {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
  }//End main
}//End question1 class
