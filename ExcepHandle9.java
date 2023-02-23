/*
 * In the same previous program, write your own exception classes to take care of negative values and 
 * values out of range (i.e. other than in the range 0-100) and do not allow program to terminate, give 
 * the message upon the wrong input submitted by the user.
 */
import java.util.*;
class NumberFormatException extends RuntimeException 
{
    String message;
    public NumberFormatException(String message) 
    {
        this.message=message;
    }
    public String toString() 
    {
		return message;
	}	
}
class MyException1 
{
    public void validateMark(int number) throws NumberFormatException
    {
        if(number<0 || number>100) 
        {
            throw new NumberFormatException("Invalid marks...Please enter the correct marks");
        }
    }
}
public class ExcepHandle9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of 10 students");
        int[] marks = new int[10];
        MyException1 me = new MyException1();
        int i=0;
        while(i!=10)
        {
            try
            {
                System.out.println("Enter mark of student "+(i+1));
                int num=scanner.nextInt();
                me.validateMark(num);
                marks[i++]=num;       
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(nfe);
            }
            catch(InputMismatchException ime)
            {
                System.out.println(ime);
                scanner.next();
            }   
        }
    }
}
