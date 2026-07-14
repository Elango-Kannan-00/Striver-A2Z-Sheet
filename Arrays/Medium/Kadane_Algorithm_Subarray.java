package Arrays.Medium;

import java.util.Scanner;

public class Kadane_Algorithm_Subarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements: ");
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        printSubarray(array, N);

        scan.close();
    }

    public static void printSubarray(int[] array, int N) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < N; i++) {
            currentSum += array[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
