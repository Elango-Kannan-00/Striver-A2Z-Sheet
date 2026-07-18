package Recursion;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String word = scan.nextLine();

        boolean result = palindrome(word, 0);

        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

        scan.close();
    }

    // Time complexity O(N), Space complexity O(N) - for call stack.
    
    public static boolean palindrome(String word, int N) {
        if (N >= word.length() / 2)
            return true;
        if (word.charAt(N) != word.charAt(word.length() - N - 1))
            return false;

        return palindrome(word, N + 1);
    }
}
