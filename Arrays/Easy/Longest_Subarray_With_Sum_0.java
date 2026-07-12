package Arrays.Easy;

/*

Example 1:
Input:
 N = 6, array[] = {9, -3, 3, -1, 6, -5}  
Result:
 5  
Explanation:
 The following subarrays sum to zero:
- {-3, 3}
- {-1, 6, -5}
- {-3, 3, -1, 6, -5}
The length of the longest subarray with sum zero is 5.

Example 2:
Input:
 N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}  
Result:
 8  
Explanation:
 Subarrays with sum zero:
- {-2, 2}
- {-8, 1, 7}
- {-2, 2, -8, 1, 7}
- {6, -2, 2, -8, 1, 7, 4, -10}
The length of the longest subarray with sum zero is 8.

*/

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Subarray_With_Sum_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        findLongestSubarrayLength(array, N);

        scan.close();
    }

    public static void findLongestSubarrayLength(int[] array, int N) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // for finding maximum length.
        int maxLen = 0;
        // for finding prefix sum.
        int sum = 0;

        for (int i = 0; i < N; i++) {
            // computing prefix sum.
            sum += array[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
}
