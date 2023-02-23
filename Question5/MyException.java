package Question5;

import java.util.regex.*;
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