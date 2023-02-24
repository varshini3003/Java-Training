package Thread3;

/*
 * Write a program to implement inventory system in which one thread called Producer will add one product
 * in the Inventory and other thread called Consumer will consume product from inventory. Thread should communicate in
 * such a way that, there should be maximum one product and minimum zero products in the inventory.
 */
import java.util.concurrent.*;
public class ThreadDemo3 {
     public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Inventory inventory = new Inventory();
        executorService.execute(()->{
            Thread.currentThread().setName("Producer");
            for(int i=0; i<5; i++)
            {
                inventory.produce();
            }
        });
        executorService.execute(()->{
            Thread.currentThread().setName("Consumer");
            for(int i=0; i<5; i++)
            {
                inventory.consume();
            }
        });
        executorService.shutdown();
    }
}
