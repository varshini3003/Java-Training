package LogisticsTime;

import java.util.*;
import java.time.*;
public class Logistic {
    public static boolean isSunday(LocalDate localDate)
    {
        String dayOfWeek = localDate.getDayOfWeek().toString();
        if("SUNDAY".equalsIgnoreCase(dayOfWeek))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the distance in kms");
		int distance=scanner.nextInt();
		System.out.println("Enter the speed of your car in km/hr");
		int speed=scanner.nextInt();
		int hour = LocalDateTime.now().getHour();  
		int minute = LocalDateTime.now().getMinute(); 
		System.out.println(hour+":"+minute);
	    LocalDate newDate = null;
	    LocalDate localDate = LocalDate.now();
        Month currMonth = localDate.getMonth();
        String month = currMonth.toString();
		int dayOfMonth = LocalDate.now().getDayOfMonth();
		DayOfWeek day = localDate.getDayOfWeek();
		int dayOfYear = LocalDate.now().getDayOfYear();
        int year = LocalDate.now().getYear();
		System.out.println(localDate+ " "+dayOfMonth+" "+day+" "+dayOfYear+" "+year+" "+month);
        double timeTaken = distance/speed;
        System.out.println("Time taken in hrs: "+ timeTaken);
        int distanceCoveredPerDay = speed*8;
        System.out.println(distanceCoveredPerDay);
        int distanceCovered=distanceCoveredPerDay;
        int actualTimeTaken=0;
        while(true)
        {
            if(distanceCovered==distance)
            {
                
                break;
            }
            if(month.equals("JANUARY") && dayOfMonth==1 || dayOfMonth==26)
            {
                
            }
            else if(month.equals("AUGUST") && dayOfMonth==15)
            {
                
            }  
            distanceCoveredPerDay++;
            actualTimeTaken+=8;
        }
        System.out.println(distanceCovered);

    }
}
