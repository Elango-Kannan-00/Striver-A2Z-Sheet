package Patterns;

/*

1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1

*/

import java.util.Scanner;

public class Tweleve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        // For the number of rows.
        for (int i = 0; i < n; i++) {
            // Initializes the value as 0
            int num = 0;
            // Left angle triangle.
            for (int j = 0; j <= i; j++) {
                // Num becomes 1, and printed.
                num++;
                System.out.print(num + " ");
            }
            // Space is printed as inverted triangle.
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("    ");
            }
            // Right angled triangle.
            for (int k = 0; k <= i; k++) {
                // Prints the same num value, and then decrements..
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }

        scan.close();
    }
}
