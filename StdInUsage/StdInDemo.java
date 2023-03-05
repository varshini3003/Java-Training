package StdInUsage;
/*
 * Count the number of characters entered through StdIn
 */
import java.io.*;
public class StdInDemo {
    public static void main(String[] args) {
        int characters=0;
        while(!StdIn.isEmpty())
        {
            String string = StdIn.readString();
            
        }
        System.out.println("Number of characters are "+characters);
    }
}
