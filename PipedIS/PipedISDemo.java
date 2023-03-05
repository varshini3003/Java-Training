package PipedIS;
import java.io.*;
public class PipedISDemo {
    public static void main(String[] args) throws IOException{
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try
        {
            pipedInputStream.connect(pipedOutputStream);
            pipedOutputStream.write(83);
            pipedOutputStream.write(86);
            pipedOutputStream.write(65);
            pipedOutputStream.write(82);
            pipedOutputStream.write(83);
            pipedOutputStream.write(72);
            System.out.println(pipedInputStream.read()); 
            System.out.println(pipedInputStream.available());
            byte[] buffer = new byte[5];
            pipedInputStream.read(buffer, 0, 5);
            String string = new String(buffer);
            System.out.println("Using read(buffer, offset, maxlen) : " + string);
            pipedInputStream.close();
        }
        catch(IOException exception) 
        {
            exception.printStackTrace();
        }
    }
    
}
