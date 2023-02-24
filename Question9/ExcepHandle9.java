package Question9;

import java.util.*;
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
