/*
 * Reverse row elements in a 2-D array
 */
public class Question19 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for(int i=0; i<4; i++)
        {
            int from=0, to=3;
            while(from<to) 
            {
                int temp = matrix[i][from];
                matrix[i][from] = matrix[i][to];
                matrix[i][to] = temp;
                from++;
                to--;
            }
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
