package Arrays.Medium;

/*

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

*/

import java.util.Scanner;

public class Stock_Buy_Sell {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements: ");
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        bruteForceApproach(array, N);
        optimalApproach(array, N);

        scan.close();
    }

    public static void bruteForceApproach(int[] array, int N) {
        int maxProfit = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int profit = array[j] - array[i];

                maxProfit = Math.max(maxProfit, profit);
            }
        }

        System.out.println(maxProfit);
    }

    public static void optimalApproach(int[] array, int N) {

        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int x : array) {
            if (x < minProfit) {
                minProfit = x;
            } else {
                maxProfit = Math.max(maxProfit, x - minProfit);
            }
        }

        System.out.println(maxProfit);
    }
}