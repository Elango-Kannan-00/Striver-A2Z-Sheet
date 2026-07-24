package Strings;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println("Before: " + input);

        Solution obj = new Solution();

        String result = obj.modify(input);

        System.out.println("After: " + result);

        scan.close();
    }
}

class Solution {
    public String modify(String s) {

        char[] array = s.toCharArray();

        int left = 0, right = array.length - 1;

        String vowels = "aeiouAEIOU";

        while (left < right) {

            if (vowels.indexOf(array[left]) != -1 && vowels.indexOf(array[right]) != -1) {

                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;

            } else if (vowels.indexOf(array[left]) == -1) {
                left++;
            } else {
                right--;
            }
        }

        return new String(array);
    }
}