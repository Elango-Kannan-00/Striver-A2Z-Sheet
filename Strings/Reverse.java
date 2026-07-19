package Strings;

/*

Sample I/O
Input - Hi how are you
Output - you are how Hi

*/

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scan.nextLine();

        reverseString(str);

        scan.close();
    }

    public static void reverseString(String str) {
        String[] array = str.split(" ");

        StringBuilder string = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            string.append(array[i]);
            string.append(" ");
        }

        System.out.println(string.toString());
    }
}