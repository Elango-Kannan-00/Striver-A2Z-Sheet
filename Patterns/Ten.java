package Patterns;

/*

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
