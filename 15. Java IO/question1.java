// 1. Write a program to read text from .txt file using InputStream

import java.io.FileInputStream;
import java.io.File;

public class question1 {

  public static void main(String args[]) {

    try {
        // create a reader
        FileInputStream fis = new FileInputStream(new File("MyFile.txt"));

        // read one byte at a time
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        // close the reader
        fis.close();

    } 
    catch (Exception ex) {
        ex.printStackTrace();
    }
  }//End main
}//End question1 class
