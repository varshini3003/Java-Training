package Thread1;
import java.util.concurrent.*;;
/*
 * Write a program which will create two threads one to display even and other to display odd numbers from 1 to 100
 */
public class ThreadDemo1 {    
     public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Numbers numbers = new Numbers();
        executorService.execute(()->{
            Thread.currentThread().setName("EvenThread");
            numbers.displayEven();
        });
        executorService.execute(()->{
            Thread.currentThread().setName("OddThread");
            numbers.displayOdd();
        });
        executorService.shutdown();
    }
}
