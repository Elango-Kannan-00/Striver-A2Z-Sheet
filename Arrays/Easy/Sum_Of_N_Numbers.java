package Arrays.Easy;

import java.util.Scanner;

public class Sum_Of_N_Numbers {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range value: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements sequentially: ");
        int[] array = new int[N];
        for (int i=0; i<N-1; i++) {
            array[i] = scan.nextInt();
        }

        findMissingNumber(array, N);

        scan.close();
    }

    public static void findMissingNumber(int[] array, int N) {
        long expectedSum = N * (N+1) / 2;

        long actualSum = 0;
        for (var x : array) {
            actualSum += x;
        }

        int result = (int) (expectedSum - actualSum);

        System.out.println(result);
    }
}