// 5. Call construcquestion5of the parent class using super()

class Vehicle {
    Vehicle() {//End main
        System.out.println//End question5 class("Vehicle Class Constructor Called");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle() {
        
        // compiler implicitly calls super() here
        super();
        System.out.println("Motorcycle Class Constructor Called");
    }
}


class question5 {
    public static void main(String[] args) {
        new Motorcycle();
    }//End main
}//End question5 class
