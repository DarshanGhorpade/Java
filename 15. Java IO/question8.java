// 8. Write text to a .txt file using BufferedWriter

import java.io.BufferedWriter;
import java.io.FileWriter;

public class question8{
	public static void main(String[] args){
    String data = "Hello!! Welcome to java.";
		try {
            // Creates a FileWriter
            FileWriter file = new FileWriter("MyFile.txt");

            // Creates a BufferedWriter
            BufferedWriter output = new BufferedWriter(file);

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        } 
		catch (Exception e){
			e.printStackTrace();
		}
	}//End main
}//End question8 class
