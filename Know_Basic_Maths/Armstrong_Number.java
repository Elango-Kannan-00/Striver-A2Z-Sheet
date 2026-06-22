package Know_Basic_Maths;

import java.util.Scanner;

/*

Example 1:
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
                                        
Example 2:
Input:N = 371                
Output: True
Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371

*/

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = scan.nextInt();

        boolean result = findArmstrong(num);

        System.out.println(result);

        scan.close();
    }

    public static boolean findArmstrong(int num) {
        int dup1 = num;
        int dup2 = num;
        int count = 0, sum = 0;

        while (dup1 > 0) {
            count++;
            dup1 /= 10;
        }

        while (dup2 > 0) {
            int digit = dup2 % 10;
            sum += Math.pow(digit, count);
            dup2 /= 10;
        }

        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }
}
