/*
 * Resize an array
 */
import java.util.*;
public class Question6 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] newarr = new int[size+5];
		int[] newarr2 = new int[size-2];
		/*
		 * Method 1 - Using System.arraycopy
		 */
		//Resizing to larger size
		System.arraycopy(arr, 0, newarr, 0, arr.length);
		System.out.println(Arrays.toString(newarr));
		//Resizing to smaller size
		System.arraycopy(newarr, newarr2.length, newarr2, 0, newarr2.length);
		System.out.println(Arrays.toString(newarr2));
		/*
		 * Method 2 - Using Arrays.copyOf
		 */
		arr = Arrays.copyOf(arr, arr.length + 6);
	    for (int i : arr)
	    {
	        System.out.println(i);
	    }
	}
}
