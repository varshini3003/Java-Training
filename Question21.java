import java.util.Scanner;

/*
 * Switch-case to print number of days in a month
 */
public class Question21 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current month and year in number: ");
        int month = sc.nextInt(), year=sc.nextInt();
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days in this month");
                break;
            case 4:
            case 6:
            case 9: 
            case 11:
                System.out.println("There are 30 days in this month");
                break;
            case 2:
                if(isLeap(year))
                {
                    System.out.print("It is a leap year and this month has 29 days");
                    break;
                }
                System.out.print("It's not a leap year and this month has 28 days");
                break;
            default:
                System.out.print("Enter a valid month");
        }
    }
    public static boolean isLeap(int year)
    {
        boolean leap = false;
        if(year % 4 == 0) 
        {
            if(year % 100 == 0) 
            {
                if(year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }  
        else
            leap = false;
        return leap;
    }
}
