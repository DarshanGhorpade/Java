// 7. Write a program with finally block

class question7 {
    public static void main(String args[]){
        try{    
            //below code do not throw any exception  
            int data=25/5;    
            System.out.println(data);    
        }    
        //catch won't be executed  
        catch(Exception e){  
            System.out.println(e);  
        }    
        //executed regardless of exception occurred or not  
        finally {  
            System.out.println("finally block is always executed");  
        }    
        System.out.println("rest of phe code...");    
	}//End main
}//End question7 class
