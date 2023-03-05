package PipedIS;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.concurrent.*;
import java.io.*;
public class ThreadCommUsingPipesDemo {
    public static void main(String[] args) throws IOException
    {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->{
            try 
            {
                pipedOutputStream.write("Hello world, pipe!".getBytes());
            } 
            catch (IOException e) {}
        });
        executorService.execute(()->{
            try 
            {
                int data = pipedInputStream.read();
                while(data != -1)
                {
                    System.out.print((char) data);
                    Thread.sleep(250);
                    data = pipedInputStream.read();
                }
            } 
            catch (Exception e) {}
        });
        executorService.shutdown();
    }
}
