import java.util.*;
public class Question16 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 55, 14, 67, 80, 73, 40, 4};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt(), flag=0, count=0; 
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                flag=1;
                count++;
                list.add(i+1);
            }
        }   
        if(flag==0)
        {
            System.out.println("The element is not found!");
            return;
        }
        System.out.print("The element is found! It is occured "+count+" times and is found at the locations: ");
        for(int i: list)
        {
            System.out.print(i+", ");
        }
    }
}
