package Recursion;

import java.util.Scanner;

public class Print_Name_N_Times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = scan.nextLine();

        printName(name, 5, 0);

        scan.close();
    }

    public static void printName(String name, int N, int count) {
        if (count == N)
            return;

        System.out.print(name + " ");
        printName(name, N, count + 1);
    }
}