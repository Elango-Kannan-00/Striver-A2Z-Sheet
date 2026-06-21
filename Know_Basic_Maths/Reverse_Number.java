package Know_Basic_Maths;

import java.util.Scanner;

/*

Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them. 
For e.g , reverse of 10400 will be 401 instead of 00401.

*/

public class Reverse_Number {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = scan.nextInt();

        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            
            num /= 10;
        }

        System.out.println(reverse);

        scan.close();
    }
}
