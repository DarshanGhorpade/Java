// 3. Read text from a .txt file using BufferedInputStream

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class question3 {
    public static void main(String[] args) {
        try {

            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("MyFile.txt");

            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            // Reads first byte from file
            int i = input .read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }//End main
}//End question3 class
