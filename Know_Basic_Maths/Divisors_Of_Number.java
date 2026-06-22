package Know_Basic_Maths;

import java.util.Scanner;

/*

Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
Input: N = 12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.

*/

public class Divisors_Of_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = scan.nextInt();

        findDivisors(num);

        scan.close();
    }

    public static void findDivisors(int num) {
        // Exludind the divisors 1 and itself.
        for (int i=2; i<num/2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
