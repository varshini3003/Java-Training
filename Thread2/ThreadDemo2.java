package Thread2;

import java.util.concurrent.*;

/*
 * Write a program to give synchronized access to multiple thread each with 
 * different message to display method which formats the message in the following manner.
 * "[ -----Message-----]"
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Message msg = new Message();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            msg.display("Learning Multithreading");
        });
        executorService.execute(()->{
            msg.display("In a different way");
        });
        executorService.shutdown();
    }
}
