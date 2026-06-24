package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Before bubble sort: " + Arrays.toString(array));

        bubbleSort(array, n);

        scan.close();
    }

    // Bubble sorting implementation.
    public static void bubbleSort(int[] array, int n) {
        // Nested loop for sorting.
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

        System.out.println("After bubble sort: " + Arrays.toString(array));
    }
}