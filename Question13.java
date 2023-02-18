/*
 * Student mark calculation using 2-D array
 */
import java.util.*;
public class Question13 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[4][4];
        for(int i=0; i<4; i++)
        {
            if(i==0)
            {
                System.out.println("Enter the roll numbers of 4 students");
            }
            else if(i==1)
            {
                System.out.println("Enter the Maths marks of 4 students");
            }
            else if(i==2)
            {
                System.out.println("Enter the Physics marks of 4 students");
            }
            else if(i==3)
            {
                System.out.println("Enter the Chemistry marks of 4 students");
            }
            for(int j=0; j<4; j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
		int stud1total=0, stud2total=0, stud3total=0, stud4total=0;
		for(int i=1; i<4; i++)
		{
			stud1total += mat[i][0];
			stud2total += mat[i][1];
			stud3total += mat[i][2];
			stud4total += mat[i][3];
		}
		System.out.println("Results as total marks obtained out of 200: ");
		System.out.println("Student 1: "+stud1total);
		System.out.println("Student 2: "+stud2total);
		System.out.println("Student 3: "+stud3total);
		System.out.println("Student 4: "+stud4total);
	}
}
