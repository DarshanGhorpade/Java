// 10. Write a program to generate ClassNotFoundException

//a class called program is defined
public class question10{ 
    //main method is called
    public static void main(String args[]){
        //class not found exception is defined using try and catch block
        try{
            // the forname method in class class looks for the mentioned class
            Class.forName("Car");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }   
    }//End main
}//End question10 class
