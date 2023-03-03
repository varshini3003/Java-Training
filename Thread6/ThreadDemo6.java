package Thread6;

import java.util.Scanner;
import java.util.concurrent.*;
/*
 * Class that keeps a running total of all characters passed to it (one at a time)
 * and throws as exception if it is passed a non-alphabetic character.
 */
public class ThreadDemo6 {
    public ThreadDemo6()
    {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(()->{});
        executorService.shutdown();
    }
    public static void main(String[] args)
    {
        new ThreadDemo6();
        Scanner scanner = new Scanner(System.in);
        MyException myException = new MyException();
        char character='\0';
        while(true)
        {
            try
            {
                System.out.println("Enter an alphabet");
                character = scanner.next().charAt(0);
                myException.totalLetters(character);
            }
            catch(InvalidAlphabetException iae)
            {
                System.out.println(iae);
                System.out.println("Total valid alphabets you entered are: " + myException.total);
                break;
            }
        }
    }
}
