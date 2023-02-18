/*
 * Program to check if a number is prime
 */
import java.util.Scanner;
public class Question4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long num=sc.nextLong();
		if(num==1)
		{
			System.out.print("Neither prime nor composite");
			return;
		}
		if(num<1 || num%2==0)
		{
			System.out.print("Not prime");
			return;
		}
		else if(num==2)
		{
			System.out.print("Prime");
			return;
		}
		for(int i=3; i<=Math.sqrt(num); i+=2)
		{
			if(num%i==0)
			{
				System.out.print("Not prime");
				return;				
			}
		}
		System.out.print("Prime");
	}
}
