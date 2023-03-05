package WriteDateObjectToFile;
import java.io.*;
import java.util.*;
public class WriteandRead {
     public static void main(String[] args) {
        Date date = new Date();
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("Object.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(date);
            objectOutputStream.close();
            System.out.println("Date object written to file successfully");
            FileInputStream fileInputStream = new FileInputStream("Object.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            System.out.println("Object has been read successfully");
            System.out.println(object);
            objectInputStream.close();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
