/*
 * Find average of the first n numbers
 */
import java.util.*;
public class Question5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		average(n);
	}
	public static void average(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum+=i;
		}
		System.out.print("Average of first n numbers is: "+sum/n);
	}
}