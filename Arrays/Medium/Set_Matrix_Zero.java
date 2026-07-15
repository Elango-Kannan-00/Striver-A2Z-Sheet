package Arrays.Medium;

/*

Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0

*/

import java.util.Scanner;
import java.util.Arrays;

public class Set_Matrix_Zero {
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
        // bruteForceApproach(matrix, N);
        betterApproach(matrix, N);

        scan.close();
    }

    // Time complexity is too high.
    public static void bruteForceApproach(int[][] matrix, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    for (int column = 0; column < N; column++) {
                        if (matrix[i][column] != 0) {
                            matrix[i][column] = -1;
                        }
                    }
                    for (int row = 0; row < N; row++) {
                        if (matrix[row][j] != 0) {
                            matrix[row][j] = -1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Before: " + Arrays.deepToString(matrix));
    }

    // Time complexity is some what better than brute force.
    public static void betterApproach(int[][] matrix, int N) {
        boolean[] column = new boolean[N];
        boolean[] row = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    column[j] = true;
                    row[i] = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("After: " + Arrays.deepToString(matrix));
    }
}
