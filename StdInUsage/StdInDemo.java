package StdInUsage;
/*
 * Count the number of characters entered through StdIn
 */
import java.util.*;
public class StdInDemo {
    public static void main(String[] args) {
        int characters=0;
        Scanner scanner = new Scanner(System.in);   
        while(scanner.hasNext())
        {
            char character = scanner.next().charAt(0);
            characters++;
        }
        System.out.println("Number of characters are "+characters);
    }
}
