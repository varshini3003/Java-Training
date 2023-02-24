package Question4;

import java.util.*;
public class ExcepHandle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phone number");
        String phno = scanner.nextLine();
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
