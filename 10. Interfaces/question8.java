/*
    8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
    Implement this interface to some class and print the values of the interface fields and
    call the interface methods
*/

//Interface
public interface Bank{ 
    int fixDeposit = 100;
    float rateOfInterest();  
}


//Class implement interface
class SBI implements Bank{     
    public float rateOfInterest(){return 9.15f;}  
}  

class question8{  
public static void main(String[] args){  
        Bank b=new SBI();  
        System.out.println("Fix Deposit: "+b.fixDeposit);  
        System.out.println("ROI: "+b.rateOfInterest());  
    }//End main
}// End question8 class
