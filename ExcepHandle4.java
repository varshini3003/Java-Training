/*
 * Create your own exception.
 * In main() create a try-catch clause to exercise your own exception
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
public class ExcepHandle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phone number");
        String phno = sc.nextLine();
        MyException me = new MyException();
        try
        {
            me.validatePhoneNumber(phno);
        }
        catch(PhoneNoInvalidException phe)
        {
            System.out.println(phe);
        }
    }
}
