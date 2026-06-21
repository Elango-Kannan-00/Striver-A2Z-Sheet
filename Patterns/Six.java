package Patterns;

import java.util.Scanner;

public class Six {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        for (int i=5; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
