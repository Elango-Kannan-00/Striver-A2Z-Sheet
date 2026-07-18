package Recursion;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int N = scan.nextInt();

        int result = findFactor(N);
        System.out.println(result);

        scan.close();
    }

    public static int findFactor(int N) {
        if (N == 0) {
            return 1;
        }

        return N * findFactor(N - 1);

    }
}
