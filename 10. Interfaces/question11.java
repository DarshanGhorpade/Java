// 11. Create an interface with static final variable

// interface
interface Animal {
    static final int age = 10;
    public float weight = 50;
    public void animalSound(); // interface method (does not have a body)
}


// Pig "implements" the Animal interface
class Pig implements Animal {
    
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class question11 {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        System.out.println("Pig weight: "+myPig.weight);
        System.out.println("Pig age: "+myPig.age);
    }//End main
}//End question11 class
