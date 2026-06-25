package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class Insertion_Sort {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();

        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Before insertion sort: " + Arrays.toString(array));
        insertionSort(array, n);

        scan.close();
    }

    // Insertion sorting implementation.
    public static void insertionSort(int[] array, int n) {
        for (int i=1; i<n; i++) {
            int key = array[i]; 
            int j = i-1;
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }

        System.out.println("After insertion sort: " + Arrays.toString(array));
    }
}
