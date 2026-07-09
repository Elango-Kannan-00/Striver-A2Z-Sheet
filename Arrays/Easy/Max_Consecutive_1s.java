package Arrays.Easy;

import java.util.Scanner;

public class Max_Consecutive_1s {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        findConsecutive1s(array, N);

        scan.close();
    }

    public static void findConsecutive1s(int[] array, int N) {
        int count = 0, max = 0;

        for (int i = 0; i < N; i++) {
            if (array[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
