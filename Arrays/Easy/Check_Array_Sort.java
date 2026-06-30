package Arrays.Easy;

import java.util.Scanner;

public class Check_Array_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        checkArraySort(array, N);

        scan.close();
    }

    public static void checkArraySort(int[] array, int N) {

        boolean isSorted = true;
        for (int i = 1; i < N; i++) {
            if (array[i] < array[i - 1])  // If any element is smaller than the previous one, then break.
                isSorted = false;
                break;
        }

        if (isSorted) {
            System.out.println("Yes, sorted.");
        } else {
            System.out.println("No, unsorted.");
        }
    }
}
