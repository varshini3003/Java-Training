import java.util.Scanner;
/*
 * Location of an array element
 */
public class Question8 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {1, 6, 33,23, 85, 13, 5};
		int len = arr.length;
		System.out.println("Enter the element to be located: ");
		int key = sc.nextInt(), ans=0;
		for(int i=0; i < len; i++) 
		{
            if (arr[i] == key) 
            {
                ans=i+1;
                break;
            }
        }
		System.out.print("Array element found at location "+ ans);
	}
}
