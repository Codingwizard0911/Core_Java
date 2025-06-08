public class VariableScopew {
    static int x = 0; //Global//Static//Class
    public static void main(String[] args) {
        //Variable scope ==> the visibility of a variable
        // Local Variable ==> variable declared inside a method or block of code
        // Global Variable ==> variable declared outside a method or block of code
        // Static Variable ==> variable declared inside a class but outside a method or block of code
        // Instance Variable ==> variable declared inside a method or block of code but outside a class
        // Class Variable ==> variable declared inside a class but outside a method or block of code

        int x = 1; //Local
        System.out.println(x);
        doSomething();
    }

    static void doSomething()
    {
        System.out.println(x);
    }
    
}
