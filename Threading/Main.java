package Threading;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
         * Threading ==> Allows your program to run multiple tasks simultaneously
         *               Helps improve performance with time consuming operations 
         *               like file input output network communication and more
         * How to create a thread?
         * 1.Extend the thread class(simpler)
         * 2.Implement the runnable interface(better)
         * 
         */
        Scanner sc = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);//Daemon method stops the sub thread when Main thread is over
        thread.start();
        System.out.println("You have 5 seconds to ENter your name");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Hello " +name);

        sc.close();
    }
    
}
