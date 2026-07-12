package Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Subarray_With_Sum_K {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int N = scan.nextInt();

        int[] array = new int[N];
        for (int i=0; i<N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int K = scan.nextInt();

        findLongestSubarrayLength(array, N, K);

        scan.close();
    }

    /*
    
    "Remove the extra" logic
    Imagine a rope.
    Total Rope = 25 meters
    Need = 15 meters
    How much should you cut from the front?
    25 - 15 = 10
    Remove that first 10 meters.
    Exactly the same logic. 
    
    */

    public static void findLongestSubarrayLength(int[] array, int N, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < array.length; i++) {

            // Step 1: Update running sum
            sum += array[i];

            // Step 2: If subarray starts from index 0
            if (sum == K) {
                maxLen = i + 1;
            }

            // Step 3: Find complement
            int complement = sum - K;

            // Step 4: Check if complement exists
            if (map.containsKey(complement)) {

                int length = i - map.get(complement);

                maxLen = Math.max(maxLen, length);
            }

            // Step 5: Store first occurrence of prefix sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
}
