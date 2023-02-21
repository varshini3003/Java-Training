import java.io.IOException;
import java.util.*;
/*
 * Create a class with a method throwing an object of class IOException. 
 * Neither catch this object nor use throws class.
 * Test and see the result
 */
/*
 * If we invoke a method that is declared to throw Exception, 
 * we should either try/catch the method invocation or declare that the method throws exception. 
 */
class Exception1
{
    public void singleDigitCheck(int num) //throws IOException
    {
        if(num>=0 && num<=9)
        {
            System.out.println("This is a single digit");
        }
        else
        {
            throw new IOException();
        }
    }
}
public class ExcepHandle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single digit ");
        int num = sc.nextInt();
        Exception1 e = new Exception1();
        /*
        try
        {*/
            e.singleDigitCheck(num);
        /* }
        catch(Exception ex)
        {
            System.out.println(ex);
        }*/
    }
}
