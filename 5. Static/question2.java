
// 2. Print instance variables in static methods

import java.util.Scanner;

class question2{

    String s;
    int i;

    question2(String name, int id) {
        this.s = name;
        this.i = id;
    }

    public void show() {
        System.out.println("Name:" + this.s);
        System.out.println("Id:" + this.i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name:");
        String s = sc.nextLine();

        System.out.print("Enter id:");
        int i = sc.nextInt();

        question2 obj = new question2(s, i);

        System.out.println("\nDetails are : ");
        obj.show();
    }// End main

}// End question2 class