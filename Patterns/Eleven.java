package Patterns;

/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                num = 1;
            else
                num = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }

        scan.close();
    }
}
