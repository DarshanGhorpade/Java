// 9. Write a program to generate ArrayIndexOutOfBoundException

class question9 {
    public static void main(String args[]){
        String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
        //Declaring 4 elements in the String array                                       
        for(int i=0;i<=arr.length;i++) {       
            //Here, no element is present at the iteration number arr.length, i.e 4  
            System.out.println(arr[i]);      
            //So it will throw ArrayIndexOutOfBoundException at iteration 4           
        }  
	}//End main
}//End question9 class
