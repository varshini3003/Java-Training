package Thread5;

/*
 * Program to demonstrate that the thread once started, can never be started again. 
 * Try and analyze the result
 */

public class ThreadDemo5 extends Thread {
    public void run()
    {
        System.out.println("Thread started...");
    }
    public static void main(String[] args) {
        new ThreadDemo5();
        ThreadDemo5 thread = new ThreadDemo5();
        thread.start();
        thread.start(); 
    }
}
