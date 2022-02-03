// 3. Apply private, public, protected and default access modifiers to the constructor

class question3{
   public String name;
   public int age;
   public float weigth;
   question3(String name){
      this.name = name;
   }
   public question3(){
       name = "NA";
       age = 0;
       weigth = 0;
   }
      
   private question3(String name, int age){
      this.name = name;
      this.age = age;
   }
   
    protected question3(String name, int age, float weigth){
      this.name = name;
      this.age = age;
      this.weigth = weigth;
   }
   public void display() {
      System.out.println("\nName: "+this.name);
      System.out.println("Age: "+this.age);
      System.out.println("Weigth: "+this.weigth);
   }

    public static void main(String[] args){
        question3 p1 = new question3();
        p1.display();

        question3 p2 = new question3("Alex",20);
        p2.display();
        
        question3 p3 = new question3("James",22, 50.6f);
        p3.display();
        
        question3 p4 = new question3("Ron");
        p4.display();
   }//End main
    
}//End question3 class
