// 6. Use this() and super() in methods not in constructors

class parent {
    String str="I am parent";
    //method of parent Class
    public void foo() {
        System.out.println("Hello World " + str);
    }
}

class child extends parent {
    String str="I am child";
    // different foo implementation in child Class
    public void foo() {
        System.out.println("Hello World "+str);
    }

    // calling the foo method of parent class
    public void parentClassFoo(){
        super.foo();
    }

    // changing the value of str in parent class and calling the foo method of parent class
    public void fooAgain(){
        this.foo();
    }
}


public class question6{
        public static void main(String args[]) {
            child obj = new child();
            obj.foo();
            obj.parentClassFoo();
            obj.fooAgain();
        }//End main
}//End question6 class
