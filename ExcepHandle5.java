/*
 * Write a class with a method that throws an exception of the type in previous exercise.
 * Compile this without the catch exception
 */
import java.util.*;
import java.util.regex.*;
class PhoneNoInvalidException extends RuntimeException 
{
    String message;
    public PhoneNoInvalidException(String message) 
    {
        this.message=message;
    }
    public String toString() 
    {
		return message;
	}	
}
class MyException 
{
    public void validatePhoneNumber(String phone) throws PhoneNoInvalidException
    {
        final String regexStr = "^[7-9][0-9]{9}$";
        if (!Pattern.matches(regexStr, phone)) 
        {
            throw new PhoneNoInvalidException("Invalid phone number");
        }
        else
        {
            System.out.println("Valid phone number");
        }
    }
}
public class ExcepHandle5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phone number");
        String phno = sc.nextLine();
        MyException me = new MyException();
        me.validatePhoneNumber(phno);
        /* Catch not included...the exception is not caught (within a catch block), so
        * the runtime system ends the program and prints the exception message.
        */
    }
}
