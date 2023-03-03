package Thread7;
/*
 * Create a simple counting thread. It will count to 100, pausing one second
 * between each number. Also, in keeping with the counting theme, it will output
 * a string every ten numbers.
 */
import java.util.concurrent.*;
public class ThreadDemo7 {
    public ThreadDemo7()
    {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(()->{});
        executorService.shutdown();
    }
    public static void main(String[] args) {
        new ThreadDemo7();
        for(int num=1; num<=100; num++)
        {
            System.out.println(num); 
            if(num%10==0)
            {
                System.out.println("End of ten numbers...");
            }     
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e) {}
        }
    }
}
