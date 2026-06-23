package Patterns;

/*

A 
A B 
A B C 
A B C D 
A B C D E

*/

import java.util.Scanner;

public class Fourteen {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        for (int i=0; i<n; i++) {
            char ch = 'A';
            for (int j=0; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        scan.close();
    }
}
