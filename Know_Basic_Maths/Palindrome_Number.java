package Know_Basic_Maths;

import java.util.Scanner;

/*

Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 
are palindromes because they remain the same when their digits are reversed.

*/

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        int dup = num, reverse = 0;
        while(num > 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;

            num /= 10;
        }

        if (reverse == dup) {
            System.out.println("Yes, Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }
        
        scan.close();
    }
}
