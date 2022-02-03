// 7. Read text from a .txt file using BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class question7 {
    public static void main(String[] args) {

        BufferedReader objReader = null;
        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader("MyFile.txt"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                if (objReader != null)
                    objReader.close();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//End main
}//End question7 class
