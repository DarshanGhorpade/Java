// 2. Write a program to write text to .txt file using OutputStream

import java.io.FileOutputStream;
import java.io.IOException;
 
/**
 * This program demonstrates how to write a text file.
 *
 */
 
public class question2 {
    public static void main(String[] args) {
        
        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("MyFile.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }//End main
}//End question2 class
