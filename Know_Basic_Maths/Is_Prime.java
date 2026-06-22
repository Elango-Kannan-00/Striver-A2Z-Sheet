package Know_Basic_Maths;

import java.util.Scanner;

public class Is_Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = scan.nextInt();

        boolean result = findPrime(num);

        System.out.println(result);

        scan.close();
    }

    public static boolean findPrime(int num) {
        int count = 0;

        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) count++;
        }

        if (count != 0) return false;
        else return true;
    }
}
