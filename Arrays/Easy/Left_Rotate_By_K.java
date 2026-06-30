package Arrays.Easy;

import java.util.Scanner;
import java.util.Arrays;

/*

Input : nums = [1, 2, 3, 4, 5, 6], k=2
Output : [3, 4, 5, 6, 1, 2]
Explanation :rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

*/

public class Left_Rotate_By_K {
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

        System.out.println("Before left array by K: " + Arrays.toString(array));

        leftRotateByK(array, N, K);

        scan.close();
    }

    public static void leftRotateByK(int[] array, int N, int K) {

        // Normalize K, if K is greater then N
        K = K % N;

        // Reverse the array from frst to K-1 elements.
        reverseArray(array, 0, K - 1);
        // Then reverse the array from K to N elements.
        reverseArray(array, K, N - 1);
        // Now, reverse all the elements.
        reverseArray(array, 0, N - 1);

        System.out.println("After left rotate by K: " + Arrays.toString(array));
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
