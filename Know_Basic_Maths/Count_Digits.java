package Know_Basic_Maths;

import java.util.Scanner;

/*

Example 1:
Input:N = 12345
Output:5
Explanation:  The number 12345 has 5 digits.
                        
Example 2:
Input:N = 7789              
Output: 4
Explanation: The number 7789 has 4 digits.  

*/

public class Count_Digits {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = scan.nextInt();

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println(count);
        
        scan.close();   
    }
}
