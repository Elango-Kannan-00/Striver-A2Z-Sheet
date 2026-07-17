package Recursion;

import java.util.Scanner;

public class Print_N_To_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the N value: ");
        int N = scan.nextInt();

        printNTo1(N, N);

        scan.close();
    }

    public static void printNTo1(int N, int count) {
        if (count < 1)
            return;

        System.out.print(count + " ");

        printNTo1(N, count - 1);
    }
}
