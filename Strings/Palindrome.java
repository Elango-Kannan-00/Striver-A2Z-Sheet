package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = scan.nextLine();

        boolean result = stringPalindrome(input);

        if (result)
            System.out.println("Yes, palindrome");
        else
            System.out.println("Not a palindrome");

        scan.close();
    }

    public static boolean stringPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
