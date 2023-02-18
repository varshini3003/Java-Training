/*
 * Reverse array elements
 */
public class Question9 {
	public static void main(String[] args)
	{
		int[] arr = new int[] {3,4,8,1,9,7};
		int start=0, end=arr.length-1;
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.print("Reversed array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
