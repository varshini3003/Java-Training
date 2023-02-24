package Question7;

/*
 * Write a program such that the user is repeatedly asked for the numerator and the divisor. 
 * For each set of data, the program prints out the result or an informative error message if there is a problem (division by zero or poor input data).
 * a. The program continues looping, even if there is a problem.
 * b. Exit the loop when data entered for the numerator start with characters "q" or "Q". Don't print out an error message in this case.
 */
import java.util.*;
public class ExcepHandle7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter numerator");
            String numer = scanner.next();
            if(numer.equals("q") || numer.equals("Q"))
            {
                break;
            }
            int numerator = Integer.parseInt(numer);
            System.out.println("Enter denominator");
            int denominator = scanner.nextInt();
            try
            {
                int fraction = numerator/denominator;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
