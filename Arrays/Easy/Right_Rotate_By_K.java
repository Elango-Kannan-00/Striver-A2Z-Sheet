package Arrays.Easy;

/*

Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2
Output : [6, 7, 1, 2, 3, 4, 5]
Explanation : rotate 1 step to the right: [7, 1, 2, 3, 4, 5, 6]
rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5] 

*/

import java.util.Arrays;
import java.util.Scanner;

public class Right_Rotate_By_K {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Enter the K value: ");
        int K = scan.nextInt();

        System.out.println("Before right rotate by K: " + Arrays.toString(array));
        rightRotate(array, N, K);

        scan.close();
    }

    public static void rightRotate(int[] array, int N, int K) {

        // Normalize K value, if it is greater than N.
        K = K % N;

        // Reverse entire array.
        reverseArray(array, 0, N - 1);
        // Reverse the array from 0 to K-1.
        reverseArray(array, 0, K - 1);
        // Reverse the remaining elements.
        reverseArray(array, K, N - 1);

        System.out.println("After right rotate by K: " + Arrays.toString(array));

    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
