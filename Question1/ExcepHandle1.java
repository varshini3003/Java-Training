package Question1;

import java.util.*;
public class ExcepHandle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single digit ");
        int num = scanner.nextInt();
        Exception1 exp = new Exception1();
        /*
        try
        {*/
            exp.singleDigitCheck(num);
        /* }
        catch(Exception ex)
        {
            System.out.println(ex);
        }*/
    }
}
