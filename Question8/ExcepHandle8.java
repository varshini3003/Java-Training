package Question8;

/*
 * Program to take care of Number format exception if user enters values other than integer for calculating
 * average of marks of ten students. Do not allow program to terminate but again continue with the program 
 * after giving the respective message to user.
 */
import java.util.*;
public class ExcepHandle8 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of 10 students");
        int[] marks = new int[10];
        int count=0;
        while(count!=10)
        {
            try
            {
                System.out.println("Enter mark of student "+(count+1));
                int num = scanner.nextInt();
                marks[count++]=num;
            }
            catch(InputMismatchException ime)
            {
                System.out.println(ime);
                scanner.next();
            }        
        }
    }
}

