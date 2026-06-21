package Patterns;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        // Upper triangle
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n-i-1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // Lower triangle
        for (int i = 1; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}