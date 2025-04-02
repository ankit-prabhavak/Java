package Arrays.MultiDimArrays;

public class basic {
    public static void main(String[] args) {
        // 2D array declaration
        int[][] matrix = new int[3][3];

        // 2D array initialization
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // printing the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("-------------------\n");
        int matrix2[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // printing the 2D array using for-each loop
        for (int[] row : matrix2) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


    }
    
}
