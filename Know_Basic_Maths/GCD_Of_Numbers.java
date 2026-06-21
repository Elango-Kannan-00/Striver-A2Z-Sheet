package Know_Basic_Maths;

import java.util.Scanner;

/*

Example 1:
Input: N1 = 9, N2 = 12

Output: 3
Explanation:
Factors of 9: 1, 3, 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3
Greatest common factor: 3 (GCD)

Example 2:
Input: N1 = 20, N2 = 15

Output: 5
Explanation:
Factors of 20: 1, 2, 4, 5, 10, 20
Factors of 15: 1, 3, 5, 15
Common Factors: 1, 5
Greatest common factor: 5 (GCD)

*/

public class GCD_Of_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        int result = findGCD(num1, num2);

        System.out.println(result);
        
        scan.close();
    }

    public static int findGCD(int num1, int num2) {
        int gcd = 0;

        for (int i = 1; i < Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) gcd = i;
        }

        return gcd;
    }
}
