/*
 * Find largest element in each row of 2-D array
 */
public class Question20 
{
    public static void main(String[] args) 
    {
        int[][] matrix = new int[][]{
        {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for(int i=0; i<4; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0; j<4; j++)
            {
                if(matrix[i][j]>max)
                {
                    max=matrix[i][j];
                }
            }
            System.out.println("Largest of row "+i + " is "+max);
        }
    }
}
