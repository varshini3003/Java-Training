package Question5;

import java.util.*;
public class ExcepHandle5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phone number");
        String phno = scanner.nextLine();
        MyException my_exception = new MyException();
        my_exception.validatePhoneNumber(phno);
        /* Catch not included...the exception is not caught (within a catch block), so
        * the runtime system ends the program and prints the exception message.
        */
    }
}
