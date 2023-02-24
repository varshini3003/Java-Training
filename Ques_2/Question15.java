package Ques_2;

import java.util.*;
public class Question15 
{
    public static void printprime()
    {
        String  primeNumbers = "";
        for (int i = 1; i <= 100; i++)         
        { 		  	  
            int count=0; 	  
            for(int num=i; num>=1; num--)
	        {
                if(i%num==0)
	            {
 		            count++;
	            }
	        }
	        if (count==2)
	        {
	            primeNumbers = primeNumbers + i + " ";
	        }	
        }	
        System.out.println("Prime numbers from 1 to 100: ");
        System.out.println(primeNumbers);
    }
    public static int order (int num)
    {
        int len = 0;
        while (num != 0) {
            len++;
            num /= 10;
        }
        return len;
    }
    public static boolean isArmstrong(int num)
    {
        int n = order(num);
        int temp = num, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + (int)Math.pow(r, n);
            temp = temp / 10;
        }
        return (sum == num);
    }
    public static boolean isPalindrome(int num)
    {
        int temp=num, sum=0;    
        while(num>0)
        {    
            int r=num%10;   
            sum=(sum*10)+r;    
            num/=10;    
        }    
        return (temp==sum);  
    }
    public static boolean isPerfect(int n)
    {
        if (n == 1)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) 
        {    
            if (n % i == 0) 
            {    
                if (i * i == n)
                    sum += i;
                else
                    sum += i + (n / i);
            }
        }
        return (sum == n);
    }
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Press:\n1. Print prime numbers from 1 to 100\n2. Armstrong number or Palindrome number or Perfect number");
	int ch = scanner.nextInt();
	if(ch==1)
        {
            printprime();
        }
        else if(ch==2)
        {
            System.out.println("Enter a number: ");
            int num=scanner.nextInt(), flag=0;
            if(isArmstrong(num))
            {
                System.out.println("The number is an armstrong number");
                flag=1;
            }
            if(isPalindrome(num))
            {
                System.out.println("The number is a Palindrome number");
                flag=1;
            }
            if(isPerfect(num))
            {
                System.out.println("The number is a perfect number");
                flag=1;
            }
            if(flag==0)
            {
                System.out.print("The number is neither an armstrong number nor a palindrome or perfect number");
            }
        }
        else
        {
            System.out.print("Enter a valid choice");
        }
    }
}
