// 5. Write a program to read text from .txt file using FileReader

import java.io.FileReader;
import java.io.IOException;
 
/**
 * This program demonstrates how to read characters from a text file.
 *
 */
 
public class question5 {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("MyFile.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }//End main
}//End question5 class
