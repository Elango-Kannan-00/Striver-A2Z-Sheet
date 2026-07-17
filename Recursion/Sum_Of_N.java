package Recursion;

import java.util.Scanner;

public class Sum_Of_N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the N value: ");
        int N = scan.nextInt();

        int sum = sumOfN(N);

        System.out.println("Sum = " + sum);

        scan.close();
    }

    public static int sumOfN(int N) {
        if (N == 1) {
            return 1;
        }

        return N + sumOfN(N - 1);
    }
}