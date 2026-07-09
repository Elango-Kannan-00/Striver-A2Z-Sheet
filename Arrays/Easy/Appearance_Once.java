package Arrays.Easy;

import java.util.Scanner;

/*

Find the number that appears once, and the other numbers twice

Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.


Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.

*/

public class Appearance_Once {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        findOnceAppeared(array, N);

        scan.close();
    }

    // Two important properties of XOR are the following:
    // XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
    // XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.
    // ←Property 2

    // Approach
    // We will just perform the XOR of all elements of the array using a loop and
    // the final XOR will be the answer.

    public static void findOnceAppeared(int[] array, int N) {
        int result = 0;

        for (var x : array) {
            result ^= x;
        }

        System.out.println(result);
    }
}
