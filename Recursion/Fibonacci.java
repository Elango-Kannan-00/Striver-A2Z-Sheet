package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        
        int result = fibonacciTwo(n);
        System.out.println(result);

        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciTwo(int N) {
        if (N <= 1) {
            return N;
        }

        int last = fibonacci(N - 1);    
        int slast = fibonacci(N - 2);

        return last + slast;
    }
}