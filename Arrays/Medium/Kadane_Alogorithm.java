package Arrays.Medium;

/*

Example 1:
Input:
 nums = [2, 3, 5, -2, 7, -4]  
Output:
 15  
Explanation:
 The subarray from index 0 to index 4 has the largest sum = 15, 
 which is the maximum sum of any contiguous subarray.

Example 2:
Input:
 nums = [-2, -3, -7, -2, -10, -4]  
Output:
 -2  
Explanation:
 The largest sum is -2, which comes from taking the element at 
 index 0 or index 3 as the subarray. Since all numbers are negative, 
 the subarray with the least negative number gives the largest sum.

*/

import java.util.Scanner;

public class Kadane_Alogorithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        System.out.println("Enter the elements: ");
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        int result = kadaneAlgo(array, N);

        System.out.println(result);

        scan.close();
    }

    // Implementing kadane's algorithm.
    public static int kadaneAlgo(int[] array, int N) {
        // Maintaining max value.
        int maxSum = Integer.MIN_VALUE;

        int currentSum = 0;
        for (int i = 0; i < N; i++) {
            // currentSum changes during the iteration.
            currentSum += array[i];

            // If currentSum is greater than maxSUm, then update the maxSum.
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum equals zero, then reset maxSum as 0.
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
