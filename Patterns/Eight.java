package Patterns;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
