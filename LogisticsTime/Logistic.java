package LogisticsTime;

import java.util.*;
import java.time.*;
public class Logistic {
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
		int month = LocalDate.now().getDayOfMonth();
		DayOfWeek day = localDate.getDayOfWeek();
		int dayOfYear = LocalDate.now().getDayOfYear();
		System.out.print(localDate+ " "+month+" "+day+" "+dayOfYear);
		String year = localDate.toString().substring(0,5);
    }
}
