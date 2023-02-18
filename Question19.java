public class Question19 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
        };
        for(int i=0; i<4; i++)
        {
            for(int j=3; j>=0; j--)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
