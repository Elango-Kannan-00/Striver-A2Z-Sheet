package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Before selection sort: " + Arrays.toString(array));

        selectionSort(array, n);

        scan.close();
    }

    // Selection sort implementation:
    // 1 - Find the minimum element in the array, except the first element.
    // 2 - Swap the minimum element with the first element.
    // 3 - Increment the first element's pointer to next.
    // 4 - Repeat the process until the array get sorted.
    public static void selectionSort(int[] array, int n) {
        int minIndex = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("After selection sort: " + Arrays.toString(array));
    }
}
