package Recursion;

import java.util.Scanner;

public class Print_1_To_N {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the N value: ");
        int N = scan.nextInt();

        printOneToN(N, 1);

        scan.close();
    }

    public static void printOneToN(int N, int count) {
        if (count > N)
            return;

        System.out.print(count + " ");

        printOneToN(N, count + 1);
    }
}
