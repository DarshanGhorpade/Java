// 11. Write a program to generate FileNotFoundException


import java.io.File;
import java.io.FileReader;

public class Myclass{ 
    //main method is called
    public static void main(String args[]){
        try{
            File file = new File("/home/techvidvan/file.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Successful");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//End main
}//End question11 class
