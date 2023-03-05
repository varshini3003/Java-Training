package LogisticsTime;
import java.time.*;
import java.util.*;
public class Logistic {
	public static int to_mins(float time) {
		int hrs = (int)time;
		int mins = (int)(60*(time-hrs));
		int total_mins = mins+(hrs*60);
		return total_mins;
	}	
	public static int no_of_sundays_in_btw(LocalDate start, LocalDate end)
	{
		int count=0;
		for(LocalDate date = start; date.isBefore(end); date=date.plusDays(1))
		{
			if(date.getDayOfWeek().toString().equals("SUNDAY"))
			{
				count++;
			}		
		}
		return count;
	}
	public static int no_of_holidays_in_btw(LocalDate start, LocalDate end)
	{
		int count=0;
		for(LocalDate date = start; date.isBefore(end); date=date.plusDays(1))
		{
			if(date.getDayOfMonth()==1 && date.getMonthValue()==1)
			{
				count++;
			}
			if(date.getDayOfMonth()==26 && date.getMonthValue()==1)
			{
				count++;
			}
			if(date.getDayOfMonth()==15 && date.getMonthValue()==8)
			{
				count++;
			}
		}
		return count;
	}
	public static int no_of_second_saturdays_in_btw(LocalDate start, LocalDate end)
	{
		int count=0;
		for(LocalDate date = start; date.isBefore(end); date=date.plusDays(1))
		{
			if(date.getDayOfMonth()>=8 && date.getDayOfMonth()<=14)
			{
				if(date.getDayOfWeek().toString().equals("SATURDAY"))
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		LocalDateTime current_datetime = LocalDateTime.now();
		LocalDate current_date = LocalDate.now();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter speed of the car");
		int speed = scanner.nextInt();
		System.out.println("Enter the distance to be travelled");
		int distance = scanner.nextInt();
		float travel_time = (float)distance/(float)speed;
		int travel_time_mins = to_mins(travel_time);
		int travel_time_days = travel_time_mins/(24*60);
		LocalDateTime endDateTime = current_datetime.plusMinutes(travel_time_mins);
		LocalDate dest_date = current_date.plusDays(travel_time_days);
		int no_of_sundays = no_of_sundays_in_btw(current_date, dest_date);
		//System.out.println(no_of_sundays);
		LocalDateTime actual_end_time = endDateTime.plusDays(no_of_sundays);
		int no_of_holidays = no_of_holidays_in_btw(current_date, dest_date);
		//System.out.println(no_of_holidays);
		actual_end_time = actual_end_time.plusDays(no_of_holidays);
		int no_of_second_saturdays = no_of_second_saturdays_in_btw(current_date, dest_date);
		//System.out.println(no_of_second_saturdays);
		actual_end_time = actual_end_time.plusDays(no_of_second_saturdays);
		System.out.println(actual_end_time);
	}
}

