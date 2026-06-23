package Patterns;

/*

A 
B B 
C C C 
D D D D 
E E E E E 

*/

import java.util.Scanner;

public class Sixteen {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        char ch = 'A';
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

        scan.close();
    }
}
