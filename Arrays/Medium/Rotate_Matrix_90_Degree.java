package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

/*

Input :matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output :
matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

*/

public class Rotate_Matrix_90_Degree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the row and column value: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of matrix: ");
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Before: " + Arrays.deepToString(matrix));
        rotateMatrix(matrix, N);

        scan.close();
    }

    public static void rotateMatrix(int[][] matrix, int N) {
        // Take tranpose of matrix;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each element of matrix.
        for (int i = 0; i < N; i++) {
            int left = 0, right = N - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("After: " + Arrays.deepToString(matrix));
    }
}
