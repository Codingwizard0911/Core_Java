package MultiThreading;

public class Main {
    public static void main(String[] args) {
        /*
         * MultiThreading ==> Enables a program to run multiple threats concurrently
         * (TUseful for background tasks or time consuming operationThread is a set of instructions that run independently\
         * Useful for background tasks or time consuming operations
         */
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(new MyRunnable());
        thread.start();
        thread1.start();
    }
    
}
