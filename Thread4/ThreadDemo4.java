package Thread4;

/*
 * Program to display digital clock
 */

import java.util.concurrent.*;
import java.time.*;
public class ThreadDemo4 {
    public ThreadDemo4()
    {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(()->{});
        executorService.shutdown();
    }
    public static void main(String[] args) {
        new ThreadDemo4();
        for(int i=0; i<60; i++)
        {
            LocalDateTime time=LocalDateTime.now();
            String currTime = time.toString();
            System.out.println(currTime.substring(11,19));
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e) {}
        }
    }
}

