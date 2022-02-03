// 12. Write a program to generate IOException


import java.io.*;

public class question12{ 
    public FileInputStream testMethod(){
        File file = new File("test.txt");
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return fileInputStream;
    }

    public static void main(String[] args){
        Myclass obj = new Myclass();
        obj.testMethod();
    }//End main
}//End question12 class
