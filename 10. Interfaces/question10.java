// 10. Create an interface with private, public and protected fields.

// interface
interface Animal {
    /*
      If the fields of the interface are private, you cannot access them in the implementing class.
      If you try to declare the fields of an interface private, a compile time error is generated saying “modifier private not allowed here”.
    */
    //private static final int age = 10;
    public float weight = 50;
    /*
      In general, the protected fields can be accessed in the same class or, the class inheriting it. But, we do not inherit an interface we will implement it.
      Therefore, cannot declare the fields of an interface protected. If you try to do so, a compile time error is generated saying “modifier protected not allowed here”.
    */
    //protected String name = "Bil";
    public void animalSound(); // interface method (does not have a body)
}


// Pig "implements" the Animal interface
class Pig implements Animal {
    
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class question10{
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        System.out.println(myPig.weight);
    }//End main
}//End question10 class
