package Arrays.Easy;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        System.out.println("Enter the array elements: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Array before reverse: " + Arrays.toString(array));

        bruteForceApproach(array, N);
        betterApproach(array, N);
        builtInMethod(array);

        scan.close();
    }

    public static void bruteForceApproach(int[] array, int N) {
        int[] reverse = new int[N];

        int j = 0;
        for (int i = N - 1; i >= 0; i--) {
            reverse[j] = array[i];
            j++;
        }

        System.out.println("Array after reverse: " + Arrays.toString(reverse));
    }

    public static void betterApproach(int[] array, int N) {
        int left = 0, right = N - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        System.out.println("Array after reverse: " + Arrays.toString(array));
    }

    public static void builtInMethod(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (var x : array)
            list.add(x);

        Collections.reverse(list);

        System.out.println("Array after reverse: " + list);
    }
}
