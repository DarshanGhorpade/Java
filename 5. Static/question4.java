
// 4. Call instance methods in static methods


public class question4 {

    private int count = 0;

    void increment(){
        count++;
    }
    void show(){
        System.out.println("Count = "+ this.count);
    }

    public static void main(String[] args) {
        question4 obj = new question4();
        obj.increment();
        obj.show();
    }// End main

}// End question4 class