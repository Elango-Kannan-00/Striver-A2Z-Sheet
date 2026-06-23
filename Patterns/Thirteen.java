package Patterns;

/*

5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/

import java.util.Scanner;

public class Thirteen {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        int num=1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        scan.close();
    }
}
